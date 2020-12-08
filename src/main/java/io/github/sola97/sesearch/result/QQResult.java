package io.github.sola97.sesearch.result;

import io.github.sola97.sesearch.dataobject.social_engineering.tables.pojos.QqPO;
import me.ihxq.projects.pna.PhoneNumberInfo;
import me.ihxq.projects.pna.PhoneNumberLookup;

public class QQResult extends QqPO {
    private PhoneNumberInfo phoneNumberInfo;

    public PhoneNumberInfo getPhoneNumberInfo() {
        return phoneNumberInfo;
    }

    public void setPhoneNumberInfo(PhoneNumberInfo phoneNumberInfo) {
        this.phoneNumberInfo = phoneNumberInfo;
    }

    @Override
    public void setPhone(String phone) {
        super.setPhone(phone);
        phoneNumberInfo = new PhoneNumberLookup().lookup(phone).orElse(null);
    }
}
