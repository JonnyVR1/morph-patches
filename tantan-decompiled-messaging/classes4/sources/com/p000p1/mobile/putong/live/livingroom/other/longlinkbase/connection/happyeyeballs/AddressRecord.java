package com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs;

import java.net.InetAddress;
import java.util.Objects;
import l.bub;
import l.ig3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class AddressRecord {

    /* JADX INFO: renamed from: a */
    public final InetAddress f7263a;

    /* JADX INFO: renamed from: b */
    public final AddressType f7264b;

    /* JADX INFO: renamed from: c */
    public final String f7265c;

    /* JADX INFO: renamed from: d */
    public final int f7266d;

    public enum AddressType {
        IPV4,
        IPV6
    }

    public AddressRecord(InetAddress inetAddress, String str, int i) {
        this.f7263a = inetAddress;
        this.f7265c = str;
        this.f7266d = i;
        this.f7264b = m9149a(inetAddress);
    }

    /* JADX INFO: renamed from: a */
    public final AddressType m9149a(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        if (address == null) {
            ig3.a("InetAddress bytes array is null");
            return null;
        }
        if (address.length == 4) {
            return AddressType.IPV4;
        }
        if (address.length == 16) {
            return AddressType.IPV6;
        }
        bub.a("Unknown address type with byte length: ", address.length);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public InetAddress m9150b() {
        return this.f7263a;
    }

    /* JADX INFO: renamed from: c */
    public String m9151c() {
        return this.f7263a.getHostAddress();
    }

    /* JADX INFO: renamed from: d */
    public String m9152d() {
        return this.f7265c;
    }

    /* JADX INFO: renamed from: e */
    public int m9153e() {
        return this.f7266d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AddressRecord addressRecord = (AddressRecord) obj;
            if (this.f7266d == addressRecord.f7266d && Objects.equals(this.f7263a, addressRecord.f7263a) && this.f7264b == addressRecord.f7264b) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public AddressType m9154f() {
        return this.f7264b;
    }

    public int hashCode() {
        return Objects.hash(this.f7263a, this.f7264b, Integer.valueOf(this.f7266d));
    }

    public String toString() {
        return "AddressRecord{address=" + m9151c() + ", port=" + this.f7266d + ", type=" + this.f7264b + ", hostname='" + this.f7265c + "'}";
    }

    public AddressRecord(InetAddress inetAddress, String str) {
        this(inetAddress, str, -1);
    }
}
