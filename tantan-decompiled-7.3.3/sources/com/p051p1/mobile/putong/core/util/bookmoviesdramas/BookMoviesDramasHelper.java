package com.p051p1.mobile.putong.core.util.bookmoviesdramas;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.InterestLevel;
import com.p051p1.mobile.putong.core.data.Literatures;
import com.p051p1.mobile.putong.core.data.LiteraturesComments;
import com.p051p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p151v.VListCell;
import p153l.bkj0;
import p153l.jyb;
import p153l.o1j0;
import p153l.psd0;
import p153l.w30;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes12.dex */
public class BookMoviesDramasHelper {

    /* JADX INFO: renamed from: a */
    public static final Map<String, String> f39230a = new LinkedHashMap<String, String>() { // from class: com.p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper.1
        {
            put("标记为\"想看\"", InterestLevel.to_watch);
            put("标记为\"在看\"", InterestLevel.watching);
            put("标记为\"看过\"", InterestLevel.watched);
            put("删除", RequestParameters.SUBRESOURCE_DELETE);
        }
    };

    /* JADX INFO: renamed from: b */
    public static WeakReference<w30> f39231b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m60620c(z20 z20Var, bkj0 bkj0Var, Throwable th) {
        z20Var.call(Boolean.FALSE, (String) bkj0Var.f77083c);
        o1j0.m165651y("保存失败，请再试一次");
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m60621d(View view) {
        WeakReference<w30> weakReference = f39231b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        f39231b.get().m204614b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m60622e(LiteraturesComments literaturesComments, Act act, String str, final z20 z20Var, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        final bkj0 bkj0VarM104818a;
        Map<String, String> map = f39230a;
        String str2 = map.get(c22660a.f210081a);
        switch (str2.hashCode()) {
            case -1431097845:
                if (!str2.equals(InterestLevel.to_watch)) {
                    bkj0VarM104818a = bkj0.m104818a(literaturesComments.interestLevel, RequestParameters.SUBRESOURCE_DELETE, map.get(c22660a.f210081a));
                } else {
                    bkj0VarM104818a = bkj0.m104818a(map.get(c22660a.f210081a), "patch", map.get(c22660a.f210081a));
                }
                break;
            case -1335458389:
                str2.equals(RequestParameters.SUBRESOURCE_DELETE);
                bkj0VarM104818a = bkj0.m104818a(literaturesComments.interestLevel, RequestParameters.SUBRESOURCE_DELETE, map.get(c22660a.f210081a));
                break;
            case 545156275:
                if (!str2.equals(InterestLevel.watching)) {
                    bkj0VarM104818a = bkj0.m104818a(literaturesComments.interestLevel, RequestParameters.SUBRESOURCE_DELETE, map.get(c22660a.f210081a));
                } else {
                    bkj0VarM104818a = bkj0.m104818a(map.get(c22660a.f210081a), "patch", map.get(c22660a.f210081a));
                }
                break;
            case 1125964206:
                if (!str2.equals(InterestLevel.watched)) {
                    bkj0VarM104818a = bkj0.m104818a(literaturesComments.interestLevel, RequestParameters.SUBRESOURCE_DELETE, map.get(c22660a.f210081a));
                } else {
                    bkj0VarM104818a = bkj0.m104818a(map.get(c22660a.f210081a), "patch", map.get(c22660a.f210081a));
                }
                break;
            default:
                bkj0VarM104818a = bkj0.m104818a(literaturesComments.interestLevel, RequestParameters.SUBRESOURCE_DELETE, map.get(c22660a.f210081a));
                break;
        }
        if (NullChecker.m82486a(literaturesComments)) {
            act.duringCreated(CoreModule.f18264c.f20424s1.m35369n3(str, literaturesComments.f21176id, (String) bkj0VarM104818a.f77081a, (String) bkj0VarM104818a.f77082b)).subscribe(psd0.m173597H(new y20() { // from class: l.z53
                @Override // p153l.y20
                public final void call(Object obj) {
                    z20Var.call((Boolean) obj, (String) bkj0VarM104818a.f77083c);
                }
            }, new y20() { // from class: l.a63
                @Override // p153l.y20
                public final void call(Object obj) {
                    BookMoviesDramasHelper.m60620c(z20Var, bkj0VarM104818a, (Throwable) obj);
                }
            }));
        } else {
            act.duringCreated(CoreModule.f18264c.f20424s1.m35376w3(str, (String) bkj0VarM104818a.f77081a)).subscribe(psd0.m173597H(new y20() { // from class: l.b63
                @Override // p153l.y20
                public final void call(Object obj) {
                    z20Var.call((Boolean) obj, (String) bkj0VarM104818a.f77083c);
                }
            }, new y20() { // from class: l.c63
                @Override // p153l.y20
                public final void call(Object obj) {
                    BookMoviesDramasHelper.m60623f(z20Var, bkj0VarM104818a, (Throwable) obj);
                }
            }));
        }
        WeakReference<w30> weakReference = f39231b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        f39231b.get().m204614b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m60623f(z20 z20Var, bkj0 bkj0Var, Throwable th) {
        z20Var.call(Boolean.FALSE, (String) bkj0Var.f77083c);
        o1j0.m165651y("保存失败，请再试一次");
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [C, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v21, types: [C, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v7, types: [C, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v9, types: [C, java.lang.String] */
    /* JADX INFO: renamed from: g */
    public static bkj0<String, String, String> m60624g(List<LiteraturesComments> list, Literatures literatures, LiteraturesComments literaturesComments) {
        bkj0<String, String, String> bkj0VarM104818a = bkj0.m104818a("", "", "");
        if (NullChecker.m82486a(literaturesComments)) {
            if (!jyb.m147479J(list)) {
                if (!TextUtils.equals(list.get(0).interestLevel, literaturesComments.interestLevel)) {
                    bkj0VarM104818a.f77082b = "both_like";
                    bkj0VarM104818a.f77081a = "都感兴趣";
                } else if (TextUtils.equals(literaturesComments.interestLevel, InterestLevel.to_watch)) {
                    bkj0VarM104818a.f77082b = "both_wish";
                    bkj0VarM104818a.f77081a = "都想看";
                } else if (TextUtils.equals(literaturesComments.interestLevel, InterestLevel.watching)) {
                    bkj0VarM104818a.f77082b = "both_watching";
                    bkj0VarM104818a.f77081a = "都在看";
                } else if (TextUtils.equals(literaturesComments.interestLevel, InterestLevel.watched)) {
                    bkj0VarM104818a.f77082b = "both_watched";
                    bkj0VarM104818a.f77081a = "都看过";
                }
                bkj0VarM104818a.f77083c = "你们都对《" + literatures.title + "》感兴趣";
                return bkj0VarM104818a;
            }
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(literaturesComments.userID);
            String str = (NullChecker.m82486a(userM116503Pa) && userM116503Pa.isFemale()) ? "她" : "他";
            if (TextUtils.equals(literaturesComments.interestLevel, InterestLevel.to_watch)) {
                bkj0VarM104818a.f77082b = "single_wish";
                bkj0VarM104818a.f77083c = String.format("%1$s想看《%2$s》", str, literatures.title);
                return bkj0VarM104818a;
            }
            if (TextUtils.equals(literaturesComments.interestLevel, InterestLevel.watching)) {
                bkj0VarM104818a.f77082b = "single_watching";
                bkj0VarM104818a.f77083c = String.format("%1$s在看《%2$s》", str, literatures.title);
                return bkj0VarM104818a;
            }
            if (TextUtils.equals(literaturesComments.interestLevel, InterestLevel.watched)) {
                bkj0VarM104818a.f77082b = "single_watched";
                bkj0VarM104818a.f77083c = String.format("%1$s看过《%2$s》", str, literatures.title);
            }
        }
        return bkj0VarM104818a;
    }

    /* JADX INFO: renamed from: h */
    public static List<CharSequence> m60625h(String str, LiteraturesComments literaturesComments) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : f39230a.entrySet()) {
            if (!NullChecker.m82486a(literaturesComments) || !TextUtils.equals(literaturesComments.interestLevel, entry.getValue())) {
                if (!TextUtils.equals(str, "movie") || !TextUtils.equals(entry.getValue(), InterestLevel.watching)) {
                    if (NullChecker.m82486a(literaturesComments) || !TextUtils.equals(entry.getValue(), RequestParameters.SUBRESOURCE_DELETE)) {
                        arrayList.add(entry.getKey());
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m60626i(String str) {
        return !TextUtils.isEmpty(str) && NullChecker.m82486a(m60630m(CoreModule.m30929H().userId(), str));
    }

    /* JADX INFO: renamed from: j */
    public static void m60627j(final Act act, final String str, String str2, final z20<Boolean, String> z20Var) {
        List<LiteraturesComments> listM60633p = m60633p(str);
        final LiteraturesComments literaturesComments = !jyb.m147479J(listM60633p) ? listM60633p.get(0) : null;
        if ((NullChecker.m82486a(literaturesComments) || CoreModule.f18264c.f20381e0.m116519U7()) && NullChecker.m82486a(act)) {
            w30 w30VarM204654F = new w30.C21001b(act).m204657I(act.getResources().getString(R$string.f19138c)).m204669U(new View.OnClickListener() { // from class: l.x53
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BookMoviesDramasHelper.m60621d(view);
                }
            }).m204665Q(m60625h(str2, literaturesComments)).m204670V(new w30.InterfaceC21003d() { // from class: l.y53
                @Override // p153l.w30.InterfaceC21003d
                /* JADX INFO: renamed from: a */
                public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                    BookMoviesDramasHelper.m60622e(literaturesComments, act, str, z20Var, vListCell, c22660a, i);
                }
            }).m204654F();
            w30VarM204654F.m204618f();
            f39231b = new WeakReference<>(w30VarM204654F);
        }
    }

    /* JADX INFO: renamed from: k */
    public static List<Literatures> m60628k(List<LiteraturesComments> list) {
        ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(list)) {
            Iterator<LiteraturesComments> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().localLiteratures);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public static List<LiteraturesComments> m60629l(String str) {
        List<LiteraturesComments> listM116562g7;
        if (TextUtils.isEmpty(str)) {
            listM116562g7 = null;
        } else {
            listM116562g7 = CoreModule.f18264c.f20381e0.m116562g7(str);
            if (jyb.m147479J(listM116562g7) && TextUtils.equals(CoreModule.m30929H().userId(), str)) {
                CoreModule.f18264c.f20381e0.m116630x7();
            }
        }
        return jyb.m147479J(listM116562g7) ? new ArrayList() : listM116562g7;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public static LiteraturesComments m60630m(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        List<LiteraturesComments> listM116562g7 = CoreModule.f18264c.f20381e0.m116562g7(str);
        if (jyb.m147479J(listM116562g7)) {
            return null;
        }
        for (LiteraturesComments literaturesComments : listM116562g7) {
            if (TextUtils.equals(literaturesComments.literatureID, str2)) {
                return literaturesComments;
            }
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public static List<LiteraturesComments> m60631n(String str, String str2) {
        return CoreModule.f18264c.f20381e0.m116498O9(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public static LiteraturesComments m60632o(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        List<LiteraturesComments> listM116562g7 = CoreModule.f18264c.f20381e0.m116562g7(str);
        if (jyb.m147479J(listM116562g7)) {
            return null;
        }
        for (LiteraturesComments literaturesComments : listM116562g7) {
            if (TextUtils.equals(literaturesComments.f21176id, str2)) {
                return literaturesComments;
            }
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: p */
    public static List<LiteraturesComments> m60633p(String str) {
        return m60631n(CoreModule.m30929H().userId(), str);
    }
}
