package io.forus.me.android.data.entity.account;

import com.google.gson.annotations.SerializedName;

public class Account {

    @SerializedName("address")
    private String address;

    public Account() {}

    public Account(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
