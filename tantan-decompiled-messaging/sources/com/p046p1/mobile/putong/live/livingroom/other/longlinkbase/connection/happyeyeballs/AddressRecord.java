package com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs;

import java.net.InetAddress;
import java.util.Objects;
import p149l.bub;
import p149l.ig3;

/* JADX INFO: loaded from: classes4.dex */
public class AddressRecord {

    /* JADX INFO: renamed from: a */
    public final InetAddress f51221a;

    /* JADX INFO: renamed from: b */
    public final AddressType f51222b;

    /* JADX INFO: renamed from: c */
    public final String f51223c;

    /* JADX INFO: renamed from: d */
    public final int f51224d;

    public enum AddressType {
        IPV4,
        IPV6
    }

    public AddressRecord(InetAddress inetAddress, String str, int i) {
        this.f51221a = inetAddress;
        this.f51223c = str;
        this.f51224d = i;
        this.f51222b = m75514a(inetAddress);
    }

    /* JADX INFO: renamed from: a */
    public final AddressType m75514a(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        if (address == null) {
            ig3.m135964a("InetAddress bytes array is null");
            return null;
        }
        if (address.length == 4) {
            return AddressType.IPV4;
        }
        if (address.length == 16) {
            return AddressType.IPV6;
        }
        bub.m103905a("Unknown address type with byte length: ", address.length);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public InetAddress m75515b() {
        return this.f51221a;
    }

    /* JADX INFO: renamed from: c */
    public String m75516c() {
        return this.f51221a.getHostAddress();
    }

    /* JADX INFO: renamed from: d */
    public String m75517d() {
        return this.f51223c;
    }

    /* JADX INFO: renamed from: e */
    public int m75518e() {
        return this.f51224d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AddressRecord addressRecord = (AddressRecord) obj;
            if (this.f51224d == addressRecord.f51224d && Objects.equals(this.f51221a, addressRecord.f51221a) && this.f51222b == addressRecord.f51222b) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public AddressType m75519f() {
        return this.f51222b;
    }

    public int hashCode() {
        return Objects.hash(this.f51221a, this.f51222b, Integer.valueOf(this.f51224d));
    }

    public String toString() {
        return "AddressRecord{address=" + m75516c() + ", port=" + this.f51224d + ", type=" + this.f51222b + ", hostname='" + this.f51223c + "'}";
    }

    public AddressRecord(InetAddress inetAddress, String str) {
        this(inetAddress, str, -1);
    }
}
