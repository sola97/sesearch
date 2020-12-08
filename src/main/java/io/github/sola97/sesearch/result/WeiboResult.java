package io.github.sola97.sesearch.result;

import io.github.sola97.sesearch.dataobject.social_engineering.tables.pojos.WeiboPO;
import me.ihxq.projects.pna.PhoneNumberInfo;
import me.ihxq.projects.pna.PhoneNumberLookup;

public class WeiboResult extends WeiboPO {
    private PhoneNumberInfo phoneNumberInfo;
    private String link;

    public PhoneNumberInfo getPhoneNumberInfo() {
        return phoneNumberInfo;
    }

    public void setPhoneNumberInfo(PhoneNumberInfo phoneNumberInfo) {
        this.phoneNumberInfo = phoneNumberInfo;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public void setPhone(String phone) {
        super.setPhone(phone);
        phoneNumberInfo = new PhoneNumberLookup().lookup(phone).orElse(null);
    }

    @Override
    public void setUid(String uid) {
        super.setUid(uid);
        this.link = "https://weibo.com/u/" + uid;
    }
}
