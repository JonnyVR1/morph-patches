package com.google.android.exoplayer2.p030ui;

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
import com.google.android.exoplayer2.p030ui.C2037a;
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
import p149l.jjl;
import p149l.p11;
import p149l.pel;
import p149l.rid0;
import p149l.rii0;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.ui.a */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2037a {

    /* JADX INFO: renamed from: a */
    public static final Pattern f9430a = Pattern.compile("(&#13;)?&#10;");

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.a$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final String f9431a;

        /* JADX INFO: renamed from: b */
        public final Map<String, String> f9432b;

        public b(String str, Map<String, String> map) {
            this.f9431a = str;
            this.f9432b = map;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.a$c */
    public static final class c {

        /* JADX INFO: renamed from: e */
        public static final Comparator<c> f9433e = new Comparator() { // from class: l.rmf0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C2037a.c.m12071a((C2037a.c) obj, (C2037a.c) obj2);
            }
        };

        /* JADX INFO: renamed from: f */
        public static final Comparator<c> f9434f = new Comparator() { // from class: l.smf0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C2037a.c.m12072b((C2037a.c) obj, (C2037a.c) obj2);
            }
        };

        /* JADX INFO: renamed from: a */
        public final int f9435a;

        /* JADX INFO: renamed from: b */
        public final int f9436b;

        /* JADX INFO: renamed from: c */
        public final String f9437c;

        /* JADX INFO: renamed from: d */
        public final String f9438d;

        public c(int i, int i2, String str, String str2) {
            this.f9435a = i;
            this.f9436b = i2;
            this.f9437c = str;
            this.f9438d = str2;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ int m12071a(c cVar, c cVar2) {
            int iCompare = Integer.compare(cVar2.f9436b, cVar.f9436b);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar.f9437c.compareTo(cVar2.f9437c);
            return iCompareTo != 0 ? iCompareTo : cVar.f9438d.compareTo(cVar2.f9438d);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ int m12072b(c cVar, c cVar2) {
            int iCompare = Integer.compare(cVar2.f9435a, cVar.f9435a);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar2.f9437c.compareTo(cVar.f9437c);
            return iCompareTo != 0 ? iCompareTo : cVar2.f9438d.compareTo(cVar.f9438d);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.a$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final List<c> f9439a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final List<c> f9440b = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static b m12063a(@Nullable CharSequence charSequence, float f) {
        if (charSequence == null) {
            return new b("", ImmutableMap.m15715of());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(m12064b(charSequence), ImmutableMap.m15715of());
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
            map.put(jjl.m141807a("bg_" + iIntValue), vck0.m197793D("background-color:%s;", jjl.m141808b(iIntValue)));
        }
        SparseArray<d> sparseArrayM12065c = m12065c(spanned, f);
        StringBuilder sb = new StringBuilder(spanned.length());
        int i2 = 0;
        while (i < sparseArrayM12065c.size()) {
            int iKeyAt = sparseArrayM12065c.keyAt(i);
            sb.append(m12064b(spanned.subSequence(i2, iKeyAt)));
            d dVar = sparseArrayM12065c.get(iKeyAt);
            Collections.sort(dVar.f9440b, c.f9434f);
            Iterator it2 = dVar.f9440b.iterator();
            while (it2.hasNext()) {
                sb.append(((c) it2.next()).f9438d);
            }
            Collections.sort(dVar.f9439a, c.f9433e);
            Iterator it3 = dVar.f9439a.iterator();
            while (it3.hasNext()) {
                sb.append(((c) it3.next()).f9437c);
            }
            i++;
            i2 = iKeyAt;
        }
        sb.append(m12064b(spanned.subSequence(i2, spanned.length())));
        return new b(sb.toString(), map);
    }

    /* JADX INFO: renamed from: b */
    public static String m12064b(CharSequence charSequence) {
        return f9430a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    /* JADX INFO: renamed from: c */
    public static SparseArray<d> m12065c(Spanned spanned, float f) {
        SparseArray<d> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String strM12067e = m12067e(obj, f);
            String strM12066d = m12066d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (strM12067e != null) {
                p11.m167011e(strM12066d);
                c cVar = new c(spanStart, spanEnd, strM12067e, strM12066d);
                m12068f(sparseArray, spanStart).f9439a.add(cVar);
                m12068f(sparseArray, spanEnd).f9440b.add(cVar);
            }
        }
        return sparseArray;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static String m12066d(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof pel) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof rii0)) {
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
            if (obj instanceof rid0) {
                return "<rt>" + m12064b(((rid0) obj).f159538a) + "</rt></ruby>";
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static String m12067e(Object obj, float f) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return vck0.m197793D("<span style='color:%s;'>", jjl.m141808b(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return vck0.m197793D("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof pel) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            return vck0.m197793D("<span style='font-size:%.2fpx;'>", Float.valueOf(absoluteSizeSpan.getDip() ? absoluteSizeSpan.getSize() : absoluteSizeSpan.getSize() / f));
        }
        if (obj instanceof RelativeSizeSpan) {
            return vck0.m197793D("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return vck0.m197793D("<span style='font-family:\"%s\";'>", family);
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
        if (!(obj instanceof rid0)) {
            if (obj instanceof UnderlineSpan) {
                return "<u>";
            }
            if (!(obj instanceof rii0)) {
                return null;
            }
            rii0 rii0Var = (rii0) obj;
            return vck0.m197793D("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", m12070h(rii0Var.f159559a, rii0Var.f159560b), m12069g(rii0Var.f159561c));
        }
        int i = ((rid0) obj).f159539b;
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
    public static d m12068f(SparseArray<d> sparseArray, int i) {
        d dVar = sparseArray.get(i);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        sparseArray.put(i, dVar2);
        return dVar2;
    }

    /* JADX INFO: renamed from: g */
    public static String m12069g(int i) {
        return i != 2 ? "over right" : "under left";
    }

    /* JADX INFO: renamed from: h */
    public static String m12070h(int i, int i2) {
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
