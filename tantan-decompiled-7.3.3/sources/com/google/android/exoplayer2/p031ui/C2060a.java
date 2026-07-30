package com.google.android.exoplayer2.p031ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.p031ui.C2060a;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import p153l.aml;
import p153l.bmk0;
import p153l.fhl;
import p153l.rri0;
import p153l.uqd0;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.ui.a */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2060a {

    /* JADX INFO: renamed from: a */
    public static final Pattern f9467a = Pattern.compile("(&#13;)?&#10;");

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.a$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final String f9468a;

        /* JADX INFO: renamed from: b */
        public final Map<String, String> f9469b;

        public b(String str, Map<String, String> map) {
            this.f9468a = str;
            this.f9469b = map;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.a$c */
    public static final class c {

        /* JADX INFO: renamed from: e */
        public static final Comparator<c> f9470e = new Comparator() { // from class: l.avf0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C2060a.c.m12125a((C2060a.c) obj, (C2060a.c) obj2);
            }
        };

        /* JADX INFO: renamed from: f */
        public static final Comparator<c> f9471f = new Comparator() { // from class: l.bvf0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C2060a.c.m12126b((C2060a.c) obj, (C2060a.c) obj2);
            }
        };

        /* JADX INFO: renamed from: a */
        public final int f9472a;

        /* JADX INFO: renamed from: b */
        public final int f9473b;

        /* JADX INFO: renamed from: c */
        public final String f9474c;

        /* JADX INFO: renamed from: d */
        public final String f9475d;

        public c(int i, int i2, String str, String str2) {
            this.f9472a = i;
            this.f9473b = i2;
            this.f9474c = str;
            this.f9475d = str2;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ int m12125a(c cVar, c cVar2) {
            int iCompare = Integer.compare(cVar2.f9473b, cVar.f9473b);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar.f9474c.compareTo(cVar2.f9474c);
            return iCompareTo != 0 ? iCompareTo : cVar.f9475d.compareTo(cVar2.f9475d);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ int m12126b(c cVar, c cVar2) {
            int iCompare = Integer.compare(cVar2.f9472a, cVar.f9472a);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar2.f9474c.compareTo(cVar.f9474c);
            return iCompareTo != 0 ? iCompareTo : cVar2.f9475d.compareTo(cVar.f9475d);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.a$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final List<c> f9476a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final List<c> f9477b = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static b m12117a(@Nullable CharSequence charSequence, float f) {
        if (charSequence == null) {
            return new b("", ImmutableMap.m15769of());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(m12118b(charSequence), ImmutableMap.m15769of());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        int i = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            map.put(aml.m98848a("bg_" + iIntValue), bmk0.m105071D("background-color:%s;", aml.m98849b(iIntValue)));
        }
        SparseArray<d> sparseArrayM12119c = m12119c(spanned, f);
        StringBuilder sb = new StringBuilder(spanned.length());
        int i2 = 0;
        while (i < sparseArrayM12119c.size()) {
            int iKeyAt = sparseArrayM12119c.keyAt(i);
            sb.append(m12118b(spanned.subSequence(i2, iKeyAt)));
            d dVar = sparseArrayM12119c.get(iKeyAt);
            Collections.sort(dVar.f9477b, c.f9471f);
            Iterator it2 = dVar.f9477b.iterator();
            while (it2.hasNext()) {
                sb.append(((c) it2.next()).f9475d);
            }
            Collections.sort(dVar.f9476a, c.f9470e);
            Iterator it3 = dVar.f9476a.iterator();
            while (it3.hasNext()) {
                sb.append(((c) it3.next()).f9474c);
            }
            i++;
            i2 = iKeyAt;
        }
        sb.append(m12118b(spanned.subSequence(i2, spanned.length())));
        return new b(sb.toString(), map);
    }

    /* JADX INFO: renamed from: b */
    public static String m12118b(CharSequence charSequence) {
        return f9467a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    /* JADX INFO: renamed from: c */
    public static SparseArray<d> m12119c(Spanned spanned, float f) {
        SparseArray<d> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String strM12121e = m12121e(obj, f);
            String strM12120d = m12120d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (strM12121e != null) {
                w11.m204369e(strM12120d);
                c cVar = new c(spanStart, spanEnd, strM12121e, strM12120d);
                m12122f(sparseArray, spanStart).f9476a.add(cVar);
                m12122f(sparseArray, spanEnd).f9477b.add(cVar);
            }
        }
        return sparseArray;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static String m12120d(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof fhl) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof rri0)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof uqd0) {
                return "<rt>" + m12118b(((uqd0) obj).f180441a) + "</rt></ruby>";
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static String m12121e(Object obj, float f) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return bmk0.m105071D("<span style='color:%s;'>", aml.m98849b(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return bmk0.m105071D("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof fhl) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            return bmk0.m105071D("<span style='font-size:%.2fpx;'>", Float.valueOf(absoluteSizeSpan.getDip() ? absoluteSizeSpan.getSize() : absoluteSizeSpan.getSize() / f));
        }
        if (obj instanceof RelativeSizeSpan) {
            return bmk0.m105071D("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return bmk0.m105071D("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (!(obj instanceof uqd0)) {
            if (obj instanceof UnderlineSpan) {
                return "<u>";
            }
            if (!(obj instanceof rri0)) {
                return null;
            }
            rri0 rri0Var = (rri0) obj;
            return bmk0.m105071D("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", m12124h(rri0Var.f164580a, rri0Var.f164581b), m12123g(rri0Var.f164582c));
        }
        int i = ((uqd0) obj).f180442b;
        if (i == -1) {
            return "<ruby style='ruby-position:unset;'>";
        }
        if (i == 1) {
            return "<ruby style='ruby-position:over;'>";
        }
        if (i != 2) {
            return null;
        }
        return "<ruby style='ruby-position:under;'>";
    }

    /* JADX INFO: renamed from: f */
    public static d m12122f(SparseArray<d> sparseArray, int i) {
        d dVar = sparseArray.get(i);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        sparseArray.put(i, dVar2);
        return dVar2;
    }

    /* JADX INFO: renamed from: g */
    public static String m12123g(int i) {
        return i != 2 ? "over right" : "under left";
    }

    /* JADX INFO: renamed from: h */
    public static String m12124h(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        if (i2 == 1) {
            sb.append("filled ");
        } else if (i2 == 2) {
            sb.append("open ");
        }
        if (i == 0) {
            sb.append("none");
        } else if (i == 1) {
            sb.append("circle");
        } else if (i == 2) {
            sb.append("dot");
        } else if (i != 3) {
            sb.append("unset");
        } else {
            sb.append("sesame");
        }
        return sb.toString();
    }
}
