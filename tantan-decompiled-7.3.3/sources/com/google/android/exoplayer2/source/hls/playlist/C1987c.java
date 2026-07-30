package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p153l.m5l;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.c */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1987c extends m5l {

    /* JADX INFO: renamed from: n */
    public static final C1987c f8663n;

    /* JADX INFO: renamed from: d */
    public final List<Uri> f8664d;

    /* JADX INFO: renamed from: e */
    public final List<b> f8665e;

    /* JADX INFO: renamed from: f */
    public final List<a> f8666f;

    /* JADX INFO: renamed from: g */
    public final List<a> f8667g;

    /* JADX INFO: renamed from: h */
    public final List<a> f8668h;

    /* JADX INFO: renamed from: i */
    public final List<a> f8669i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final C1894k f8670j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final List<C1894k> f8671k;

    /* JADX INFO: renamed from: l */
    public final Map<String, String> f8672l;

    /* JADX INFO: renamed from: m */
    public final List<DrmInitData> f8673m;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final Uri f8674a;

        /* JADX INFO: renamed from: b */
        public final C1894k f8675b;

        /* JADX INFO: renamed from: c */
        public final String f8676c;

        /* JADX INFO: renamed from: d */
        public final String f8677d;

        public a(@Nullable Uri uri, C1894k c1894k, String str, String str2) {
            this.f8674a = uri;
            this.f8675b = c1894k;
            this.f8676c = str;
            this.f8677d = str2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.c$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final Uri f8678a;

        /* JADX INFO: renamed from: b */
        public final C1894k f8679b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final String f8680c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public final String f8681d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public final String f8682e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public final String f8683f;

        public b(Uri uri, C1894k c1894k, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.f8678a = uri;
            this.f8679b = c1894k;
            this.f8680c = str;
            this.f8681d = str2;
            this.f8682e = str3;
            this.f8683f = str4;
        }

        /* JADX INFO: renamed from: b */
        public static b m11321b(Uri uri) {
            return new b(uri, new C1894k.b().m10388U("0").m10380M("application/x-mpegURL").m10374G(), null, null, null, null);
        }

        /* JADX INFO: renamed from: a */
        public b m11322a(C1894k c1894k) {
            return new b(this.f8678a, c1894k, this.f8680c, this.f8681d, this.f8682e, this.f8683f);
        }
    }

    static {
        List list = Collections.EMPTY_LIST;
        f8663n = new C1987c("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public C1987c(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, @Nullable C1894k c1894k, @Nullable List<C1894k> list7, boolean z, Map<String, String> map, List<DrmInitData> list8) {
        super(str, list, z);
        this.f8664d = Collections.unmodifiableList(m11319f(list2, list3, list4, list5, list6));
        this.f8665e = Collections.unmodifiableList(list2);
        this.f8666f = Collections.unmodifiableList(list3);
        this.f8667g = Collections.unmodifiableList(list4);
        this.f8668h = Collections.unmodifiableList(list5);
        this.f8669i = Collections.unmodifiableList(list6);
        this.f8670j = c1894k;
        this.f8671k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f8672l = Collections.unmodifiableMap(map);
        this.f8673m = Collections.unmodifiableList(list8);
    }

    /* JADX INFO: renamed from: b */
    public static void m11316b(List<a> list, List<Uri> list2) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = list.get(i).f8674a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static <T> List<T> m11317d(List<T> list, int i, List<StreamKey> list2) {
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
    public static C1987c m11318e(String str) {
        List listSingletonList = Collections.singletonList(b.m11321b(Uri.parse(str)));
        List list = Collections.EMPTY_LIST;
        return new C1987c("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
    }

    /* JADX INFO: renamed from: f */
    public static List<Uri> m11319f(List<b> list, List<a> list2, List<a> list3, List<a> list4, List<a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Uri uri = list.get(i).f8678a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        m11316b(list2, arrayList);
        m11316b(list3, arrayList);
        m11316b(list4, arrayList);
        m11316b(list5, arrayList);
        return arrayList;
    }

    @Override // p153l.lni
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C1987c mo11307a(List<StreamKey> list) {
        String str = this.f134910a;
        List<String> list2 = this.f134911b;
        List listM11317d = m11317d(this.f8665e, 0, list);
        List list3 = Collections.EMPTY_LIST;
        return new C1987c(str, list2, listM11317d, list3, m11317d(this.f8667g, 1, list), m11317d(this.f8668h, 2, list), list3, this.f8670j, this.f8671k, this.f134912c, this.f8672l, this.f8673m);
    }
}
