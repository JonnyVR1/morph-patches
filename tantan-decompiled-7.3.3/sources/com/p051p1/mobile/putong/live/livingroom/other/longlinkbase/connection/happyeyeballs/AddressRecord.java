package com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs;

import java.net.InetAddress;
import java.util.Objects;
import p153l.pvb;
import p153l.wg3;

/* JADX INFO: loaded from: classes5.dex */
public class AddressRecord {

    /* JADX INFO: renamed from: a */
    public final InetAddress f52069a;

    /* JADX INFO: renamed from: b */
    public final AddressType f52070b;

    /* JADX INFO: renamed from: c */
    public final String f52071c;

    /* JADX INFO: renamed from: d */
    public final int f52072d;

    public enum AddressType {
        IPV4,
        IPV6
    }

    public AddressRecord(InetAddress inetAddress, String str, int i) {
        this.f52069a = inetAddress;
        this.f52071c = str;
        this.f52072d = i;
        this.f52070b = m76697a(inetAddress);
    }

    /* JADX INFO: renamed from: a */
    public final AddressType m76697a(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        if (address == null) {
            wg3.m206174a("InetAddress bytes array is null");
            return null;
        }
        if (address.length == 4) {
            return AddressType.IPV4;
        }
        if (address.length == 16) {
            return AddressType.IPV6;
        }
        pvb.m173939a("Unknown address type with byte length: ", address.length);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public InetAddress m76698b() {
        return this.f52069a;
    }

    /* JADX INFO: renamed from: c */
    public String m76699c() {
        return this.f52069a.getHostAddress();
    }

    /* JADX INFO: renamed from: d */
    public String m76700d() {
        return this.f52071c;
    }

    /* JADX INFO: renamed from: e */
    public int m76701e() {
        return this.f52072d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AddressRecord addressRecord = (AddressRecord) obj;
            if (this.f52072d == addressRecord.f52072d && Objects.equals(this.f52069a, addressRecord.f52069a) && this.f52070b == addressRecord.f52070b) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public AddressType m76702f() {
        return this.f52070b;
    }

    public int hashCode() {
        return Objects.hash(this.f52069a, this.f52070b, Integer.valueOf(this.f52072d));
    }

    public String toString() {
        return "AddressRecord{address=" + m76699c() + ", port=" + this.f52072d + ", type=" + this.f52070b + ", hostname='" + this.f52071c + "'}";
    }

    public AddressRecord(InetAddress inetAddress, String str) {
        this(inetAddress, str, -1);
    }
}
