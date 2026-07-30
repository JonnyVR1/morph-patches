package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p149l.j6f;
import p149l.q9x0;

/* JADX INFO: loaded from: classes6.dex */
public class RequestConfiguration {

    /* JADX INFO: renamed from: f */
    @NonNull
    public static final List f9640f = Arrays.asList("MA", j6f.GPS_DIRECTION_TRUE, "PG", "G");

    /* JADX INFO: renamed from: a */
    public final int f9641a;

    /* JADX INFO: renamed from: b */
    public final int f9642b;

    /* JADX INFO: renamed from: c */
    public final String f9643c;

    /* JADX INFO: renamed from: d */
    public final List f9644d;

    /* JADX INFO: renamed from: e */
    public final PublisherPrivacyPersonalizationState f9645e;

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
    public static class C2069a {

        /* JADX INFO: renamed from: a */
        public int f9646a = -1;

        /* JADX INFO: renamed from: b */
        public int f9647b = -1;

        /* JADX INFO: renamed from: c */
        public String f9648c = null;

        /* JADX INFO: renamed from: d */
        public final List f9649d = new ArrayList();

        /* JADX INFO: renamed from: e */
        public PublisherPrivacyPersonalizationState f9650e = PublisherPrivacyPersonalizationState.DEFAULT;

        @NonNull
        /* JADX INFO: renamed from: a */
        public RequestConfiguration m12228a() {
            return new RequestConfiguration(this.f9646a, this.f9647b, this.f9648c, this.f9649d, this.f9650e, null);
        }
    }

    public /* synthetic */ RequestConfiguration(int i, int i2, String str, List list, PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState, q9x0 q9x0Var) {
        this.f9641a = i;
        this.f9642b = i2;
        this.f9643c = str;
        this.f9644d = list;
        this.f9645e = publisherPrivacyPersonalizationState;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public String m12223a() {
        String str = this.f9643c;
        return str == null ? "" : str;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public PublisherPrivacyPersonalizationState m12224b() {
        return this.f9645e;
    }

    /* JADX INFO: renamed from: c */
    public int m12225c() {
        return this.f9641a;
    }

    /* JADX INFO: renamed from: d */
    public int m12226d() {
        return this.f9642b;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public List<String> m12227e() {
        return new ArrayList(this.f9644d);
    }
}
