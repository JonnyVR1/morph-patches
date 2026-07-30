package com.p000p1.mobile.putong.core.util.bookmoviesdramas;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.InterestLevel;
import com.p000p1.mobile.putong.core.data.Literatures;
import com.p000p1.mobile.putong.core.data.LiteraturesComments;
import com.p000p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l.c40;
import l.e30;
import l.f30;
import l.lsi0;
import l.mkd0;
import l.vwb;
import l.xaj0;
import v.VListCell;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class BookMoviesDramasHelper {

    /* JADX INFO: renamed from: a */
    public static final Map<String, String> f2324a = new LinkedHashMap<String, String>() { // from class: com.p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper.1
        {
            put("标记为\"想看\"", InterestLevel.to_watch);
            put("标记为\"在看\"", InterestLevel.watching);
            put("标记为\"看过\"", InterestLevel.watched);
            put("删除", "delete");
        }
    };

    /* JADX INFO: renamed from: b */
    public static WeakReference<c40> f2325b;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m4844c(f30 f30Var, xaj0 xaj0Var, Throwable th) {
        f30Var.call(Boolean.FALSE, (String) xaj0Var.c);
        lsi0.y("保存失败，请再试一次");
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m4845d(View view) {
        WeakReference<c40> weakReference = f2325b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        f2325b.get().b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m4846e(LiteraturesComments literaturesComments, Act act, String str, final f30 f30Var, VListCell vListCell, VListCell.a aVar, int i) {
        final xaj0 xaj0VarA;
        Map<String, String> map = f2324a;
        String str2 = map.get(aVar.a);
        switch (str2.hashCode()) {
            case -1431097845:
                if (!str2.equals(InterestLevel.to_watch)) {
                    xaj0VarA = xaj0.a(literaturesComments.interestLevel, "delete", map.get(aVar.a));
                } else {
                    xaj0VarA = xaj0.a(map.get(aVar.a), "patch", map.get(aVar.a));
                }
                break;
            case -1335458389:
                str2.equals("delete");
                xaj0VarA = xaj0.a(literaturesComments.interestLevel, "delete", map.get(aVar.a));
                break;
            case 545156275:
                if (!str2.equals(InterestLevel.watching)) {
                    xaj0VarA = xaj0.a(literaturesComments.interestLevel, "delete", map.get(aVar.a));
                } else {
                    xaj0VarA = xaj0.a(map.get(aVar.a), "patch", map.get(aVar.a));
                }
                break;
            case 1125964206:
                if (!str2.equals(InterestLevel.watched)) {
                    xaj0VarA = xaj0.a(literaturesComments.interestLevel, "delete", map.get(aVar.a));
                } else {
                    xaj0VarA = xaj0.a(map.get(aVar.a), "patch", map.get(aVar.a));
                }
                break;
            default:
                xaj0VarA = xaj0.a(literaturesComments.interestLevel, "delete", map.get(aVar.a));
                break;
        }
        if (NullChecker.a(literaturesComments)) {
            act.duringCreated(CoreModule.c.s1.n3(str, literaturesComments.f96id, (String) xaj0VarA.a, (String) xaj0VarA.b)).subscribe(mkd0.H(new e30() { // from class: l.j53
                public final void call(Object obj) {
                    f30Var.call((Boolean) obj, (String) xaj0VarA.c);
                }
            }, new e30() { // from class: l.k53
                public final void call(Object obj) {
                    BookMoviesDramasHelper.m4844c(f30Var, xaj0VarA, (Throwable) obj);
                }
            }));
        } else {
            act.duringCreated(CoreModule.c.s1.w3(str, (String) xaj0VarA.a)).subscribe(mkd0.H(new e30() { // from class: l.l53
                public final void call(Object obj) {
                    f30Var.call((Boolean) obj, (String) xaj0VarA.c);
                }
            }, new e30() { // from class: l.m53
                public final void call(Object obj) {
                    BookMoviesDramasHelper.m4847f(f30Var, xaj0VarA, (Throwable) obj);
                }
            }));
        }
        WeakReference<c40> weakReference = f2325b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        f2325b.get().b();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m4847f(f30 f30Var, xaj0 xaj0Var, Throwable th) {
        f30Var.call(Boolean.FALSE, (String) xaj0Var.c);
        lsi0.y("保存失败，请再试一次");
    }

    /* JADX INFO: renamed from: g */
    public static xaj0<String, String, String> m4848g(List<LiteraturesComments> list, Literatures literatures, LiteraturesComments literaturesComments) {
        xaj0<String, String, String> xaj0VarA = xaj0.a("", "", "");
        if (NullChecker.a(literaturesComments)) {
            if (!vwb.J(list)) {
                if (!TextUtils.equals(list.get(0).interestLevel, literaturesComments.interestLevel)) {
                    xaj0VarA.b = "both_like";
                    xaj0VarA.a = "都感兴趣";
                } else if (TextUtils.equals(literaturesComments.interestLevel, InterestLevel.to_watch)) {
                    xaj0VarA.b = "both_wish";
                    xaj0VarA.a = "都想看";
                } else if (TextUtils.equals(literaturesComments.interestLevel, InterestLevel.watching)) {
                    xaj0VarA.b = "both_watching";
                    xaj0VarA.a = "都在看";
                } else if (TextUtils.equals(literaturesComments.interestLevel, InterestLevel.watched)) {
                    xaj0VarA.b = "both_watched";
                    xaj0VarA.a = "都看过";
                }
                xaj0VarA.c = "你们都对《" + literatures.title + "》感兴趣";
                return xaj0VarA;
            }
            User userPa = CoreModule.c.e0.Pa(literaturesComments.userID);
            String str = (NullChecker.a(userPa) && userPa.isFemale()) ? "她" : "他";
            if (TextUtils.equals(literaturesComments.interestLevel, InterestLevel.to_watch)) {
                xaj0VarA.b = "single_wish";
                xaj0VarA.c = String.format("%1$s想看《%2$s》", str, literatures.title);
                return xaj0VarA;
            }
            if (TextUtils.equals(literaturesComments.interestLevel, InterestLevel.watching)) {
                xaj0VarA.b = "single_watching";
                xaj0VarA.c = String.format("%1$s在看《%2$s》", str, literatures.title);
                return xaj0VarA;
            }
            if (TextUtils.equals(literaturesComments.interestLevel, InterestLevel.watched)) {
                xaj0VarA.b = "single_watched";
                xaj0VarA.c = String.format("%1$s看过《%2$s》", str, literatures.title);
            }
        }
        return xaj0VarA;
    }

    /* JADX INFO: renamed from: h */
    public static List<CharSequence> m4849h(String str, LiteraturesComments literaturesComments) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : f2324a.entrySet()) {
            if (!NullChecker.a(literaturesComments) || !TextUtils.equals(literaturesComments.interestLevel, entry.getValue())) {
                if (!TextUtils.equals(str, "movie") || !TextUtils.equals(entry.getValue(), InterestLevel.watching)) {
                    if (NullChecker.a(literaturesComments) || !TextUtils.equals(entry.getValue(), "delete")) {
                        arrayList.add(entry.getKey());
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m4850i(String str) {
        return !TextUtils.isEmpty(str) && NullChecker.a(m4854m(CoreModule.H().userId(), str));
    }

    /* JADX INFO: renamed from: j */
    public static void m4851j(final Act act, final String str, String str2, final f30<Boolean, String> f30Var) {
        List<LiteraturesComments> listM4857p = m4857p(str);
        final LiteraturesComments literaturesComments = !vwb.J(listM4857p) ? listM4857p.get(0) : null;
        if ((NullChecker.a(literaturesComments) || CoreModule.c.e0.U7()) && NullChecker.a(act)) {
            c40 c40VarF = new c40.b(act).I(act.getResources().getString(R.string.c)).U(new View.OnClickListener() { // from class: l.h53
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BookMoviesDramasHelper.m4845d(view);
                }
            }).Q(m4849h(str2, literaturesComments)).V(new c40.d() { // from class: l.i53
                /* JADX INFO: renamed from: a */
                public final void m7128a(VListCell vListCell, VListCell.a aVar, int i) {
                    BookMoviesDramasHelper.m4846e(literaturesComments, act, str, f30Var, vListCell, aVar, i);
                }
            }).F();
            c40VarF.f();
            f2325b = new WeakReference<>(c40VarF);
        }
    }

    /* JADX INFO: renamed from: k */
    public static List<Literatures> m4852k(List<LiteraturesComments> list) {
        ArrayList arrayList = new ArrayList();
        if (!vwb.J(list)) {
            Iterator<LiteraturesComments> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().localLiteratures);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public static List<LiteraturesComments> m4853l(String str) {
        List<LiteraturesComments> listG7;
        if (TextUtils.isEmpty(str)) {
            listG7 = null;
        } else {
            listG7 = CoreModule.c.e0.g7(str);
            if (vwb.J(listG7) && TextUtils.equals(CoreModule.H().userId(), str)) {
                CoreModule.c.e0.x7();
            }
        }
        return vwb.J(listG7) ? new ArrayList() : listG7;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public static LiteraturesComments m4854m(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        List<LiteraturesComments> listG7 = CoreModule.c.e0.g7(str);
        if (vwb.J(listG7)) {
            return null;
        }
        for (LiteraturesComments literaturesComments : listG7) {
            if (TextUtils.equals(literaturesComments.literatureID, str2)) {
                return literaturesComments;
            }
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public static List<LiteraturesComments> m4855n(String str, String str2) {
        return CoreModule.c.e0.O9(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public static LiteraturesComments m4856o(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        List<LiteraturesComments> listG7 = CoreModule.c.e0.g7(str);
        if (vwb.J(listG7)) {
            return null;
        }
        for (LiteraturesComments literaturesComments : listG7) {
            if (TextUtils.equals(literaturesComments.f96id, str2)) {
                return literaturesComments;
            }
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: p */
    public static List<LiteraturesComments> m4857p(String str) {
        return m4855n(CoreModule.H().userId(), str);
    }
}
