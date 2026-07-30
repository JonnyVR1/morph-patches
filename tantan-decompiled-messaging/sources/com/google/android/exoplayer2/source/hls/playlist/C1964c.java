package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p149l.w2l;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.c */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1964c extends w2l {

    /* JADX INFO: renamed from: n */
    public static final C1964c f8626n;

    /* JADX INFO: renamed from: d */
    public final List<Uri> f8627d;

    /* JADX INFO: renamed from: e */
    public final List<b> f8628e;

    /* JADX INFO: renamed from: f */
    public final List<a> f8629f;

    /* JADX INFO: renamed from: g */
    public final List<a> f8630g;

    /* JADX INFO: renamed from: h */
    public final List<a> f8631h;

    /* JADX INFO: renamed from: i */
    public final List<a> f8632i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final C1871k f8633j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final List<C1871k> f8634k;

    /* JADX INFO: renamed from: l */
    public final Map<String, String> f8635l;

    /* JADX INFO: renamed from: m */
    public final List<DrmInitData> f8636m;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final Uri f8637a;

        /* JADX INFO: renamed from: b */
        public final C1871k f8638b;

        /* JADX INFO: renamed from: c */
        public final String f8639c;

        /* JADX INFO: renamed from: d */
        public final String f8640d;

        public a(@Nullable Uri uri, C1871k c1871k, String str, String str2) {
            this.f8637a = uri;
            this.f8638b = c1871k;
            this.f8639c = str;
            this.f8640d = str2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.c$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final Uri f8641a;

        /* JADX INFO: renamed from: b */
        public final C1871k f8642b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final String f8643c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public final String f8644d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public final String f8645e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public final String f8646f;

        public b(Uri uri, C1871k c1871k, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.f8641a = uri;
            this.f8642b = c1871k;
            this.f8643c = str;
            this.f8644d = str2;
            this.f8645e = str3;
            this.f8646f = str4;
        }

        /* JADX INFO: renamed from: b */
        public static b m11267b(Uri uri) {
            return new b(uri, new C1871k.b().m10334U("0").m10326M("application/x-mpegURL").m10320G(), null, null, null, null);
        }

        /* JADX INFO: renamed from: a */
        public b m11268a(C1871k c1871k) {
            return new b(this.f8641a, c1871k, this.f8643c, this.f8644d, this.f8645e, this.f8646f);
        }
    }

    static {
        List list = Collections.EMPTY_LIST;
        f8626n = new C1964c("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public C1964c(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, @Nullable C1871k c1871k, @Nullable List<C1871k> list7, boolean z, Map<String, String> map, List<DrmInitData> list8) {
        super(str, list, z);
        this.f8627d = Collections.unmodifiableList(m11265f(list2, list3, list4, list5, list6));
        this.f8628e = Collections.unmodifiableList(list2);
        this.f8629f = Collections.unmodifiableList(list3);
        this.f8630g = Collections.unmodifiableList(list4);
        this.f8631h = Collections.unmodifiableList(list5);
        this.f8632i = Collections.unmodifiableList(list6);
        this.f8633j = c1871k;
        this.f8634k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f8635l = Collections.unmodifiableMap(map);
        this.f8636m = Collections.unmodifiableList(list8);
    }

    /* JADX INFO: renamed from: b */
    public static void m11262b(List<a> list, List<Uri> list2) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = list.get(i).f8637a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static <T> List<T> m11263d(List<T> list, int i, List<StreamKey> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            T t = list.get(i2);
            for (int i3 = 0; i3 < list2.size(); i3++) {
                StreamKey streamKey = list2.get(i3);
                if (streamKey.groupIndex == i && streamKey.streamIndex == i2) {
                    arrayList.add(t);
                    break;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static C1964c m11264e(String str) {
        List listSingletonList = Collections.singletonList(b.m11267b(Uri.parse(str)));
        List list = Collections.EMPTY_LIST;
        return new C1964c("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
    }

    /* JADX INFO: renamed from: f */
    public static List<Uri> m11265f(List<b> list, List<a> list2, List<a> list3, List<a> list4, List<a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Uri uri = list.get(i).f8641a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        m11262b(list2, arrayList);
        m11262b(list3, arrayList);
        m11262b(list4, arrayList);
        m11262b(list5, arrayList);
        return arrayList;
    }

    @Override // p149l.pki
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C1964c mo11253a(List<StreamKey> list) {
        String str = this.f184248a;
        List<String> list2 = this.f184249b;
        List listM11263d = m11263d(this.f8628e, 0, list);
        List list3 = Collections.EMPTY_LIST;
        return new C1964c(str, list2, listM11263d, list3, m11263d(this.f8630g, 1, list), m11263d(this.f8631h, 2, list), list3, this.f8633j, this.f8634k, this.f184250c, this.f8635l, this.f8636m);
    }
}
