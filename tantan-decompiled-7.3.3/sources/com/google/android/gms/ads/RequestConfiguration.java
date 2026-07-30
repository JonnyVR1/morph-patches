package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p153l.p7f;
import p153l.wix0;

/* JADX INFO: loaded from: classes6.dex */
public class RequestConfiguration {

    /* JADX INFO: renamed from: f */
    @NonNull
    public static final List f9677f = Arrays.asList("MA", p7f.GPS_DIRECTION_TRUE, "PG", "G");

    /* JADX INFO: renamed from: a */
    public final int f9678a;

    /* JADX INFO: renamed from: b */
    public final int f9679b;

    /* JADX INFO: renamed from: c */
    public final String f9680c;

    /* JADX INFO: renamed from: d */
    public final List f9681d;

    /* JADX INFO: renamed from: e */
    public final PublisherPrivacyPersonalizationState f9682e;

    public enum PublisherPrivacyPersonalizationState {
        DEFAULT(0),
        ENABLED(1),
        DISABLED(2);

        private final int zzb;

        PublisherPrivacyPersonalizationState(int i) {
            this.zzb = i;
        }

        public int getValue() {
            return this.zzb;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.ads.RequestConfiguration$a */
    public static class C2092a {

        /* JADX INFO: renamed from: a */
        public int f9683a = -1;

        /* JADX INFO: renamed from: b */
        public int f9684b = -1;

        /* JADX INFO: renamed from: c */
        public String f9685c = null;

        /* JADX INFO: renamed from: d */
        public final List f9686d = new ArrayList();

        /* JADX INFO: renamed from: e */
        public PublisherPrivacyPersonalizationState f9687e = PublisherPrivacyPersonalizationState.DEFAULT;

        @NonNull
        /* JADX INFO: renamed from: a */
        public RequestConfiguration m12282a() {
            return new RequestConfiguration(this.f9683a, this.f9684b, this.f9685c, this.f9686d, this.f9687e, null);
        }
    }

    public /* synthetic */ RequestConfiguration(int i, int i2, String str, List list, PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState, wix0 wix0Var) {
        this.f9678a = i;
        this.f9679b = i2;
        this.f9680c = str;
        this.f9681d = list;
        this.f9682e = publisherPrivacyPersonalizationState;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public String m12277a() {
        String str = this.f9680c;
        return str == null ? "" : str;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public PublisherPrivacyPersonalizationState m12278b() {
        return this.f9682e;
    }

    /* JADX INFO: renamed from: c */
    public int m12279c() {
        return this.f9678a;
    }

    /* JADX INFO: renamed from: d */
    public int m12280d() {
        return this.f9679b;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public List<String> m12281e() {
        return new ArrayList(this.f9681d);
    }
}
