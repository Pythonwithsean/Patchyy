package org.patchy.utils;
public class OsFinder {
    String os;

    public OsFinder() {
        this.os = System.getProperty("os.name");
    }

    public String getOs() {
        return String.format("Your Operating system is %s", this.os);
    }
}
