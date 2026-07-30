package com.p046p1.mobile.putong.core.util.bookmoviesdramas;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.InterestLevel;
import com.p046p1.mobile.putong.core.data.Literatures;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import com.p046p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p147v.VListCell;
import p149l.c40;
import p149l.e30;
import p149l.f30;
import p149l.lsi0;
import p149l.mkd0;
import p149l.vwb;
import p149l.xaj0;

/* JADX INFO: loaded from: classes10.dex */
public class BookMoviesDramasHelper {

    /* JADX INFO: renamed from: a */
    public static final Map<String, String> f38382a = new LinkedHashMap<String, String>() { // from class: com.p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper.1
        {
            put("标记为\"想看\"", InterestLevel.to_watch);
            put("标记为\"在看\"", InterestLevel.watching);
            put("标记为\"看过\"", InterestLevel.watched);
            put("删除", RequestParameters.SUBRESOURCE_DELETE);
        }
    };

    /* JADX INFO: renamed from: b */
    public static WeakReference<c40> f38383b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m59436c(f30 f30Var, xaj0 xaj0Var, Throwable th) {
        f30Var.call(Boolean.FALSE, (String) xaj0Var.f191753c);
        lsi0.m151595y("保存失败，请再试一次");
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m59437d(View view) {
        WeakReference<c40> weakReference = f38383b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        f38383b.get().m105113b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m59438e(LiteraturesComments literaturesComments, Act act, String str, final f30 f30Var, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        final xaj0 xaj0VarM207578a;
        Map<String, String> map = f38382a;
        String str2 = map.get(c22545a.f209159a);
        switch (str2.hashCode()) {
            case -1431097845:
                if (!str2.equals(InterestLevel.to_watch)) {
                    xaj0VarM207578a = xaj0.m207578a(literaturesComments.interestLevel, RequestParameters.SUBRESOURCE_DELETE, map.get(c22545a.f209159a));
                } else {
                    xaj0VarM207578a = xaj0.m207578a(map.get(c22545a.f209159a), "patch", map.get(c22545a.f209159a));
                }
                break;
            case -1335458389:
                str2.equals(RequestParameters.SUBRESOURCE_DELETE);
                xaj0VarM207578a = xaj0.m207578a(literaturesComments.interestLevel, RequestParameters.SUBRESOURCE_DELETE, map.get(c22545a.f209159a));
                break;
            case 545156275:
                if (!str2.equals(InterestLevel.watching)) {
                    xaj0VarM207578a = xaj0.m207578a(literaturesComments.interestLevel, RequestParameters.SUBRESOURCE_DELETE, map.get(c22545a.f209159a));
                } else {
                    xaj0VarM207578a = xaj0.m207578a(map.get(c22545a.f209159a), "patch", map.get(c22545a.f209159a));
                }
                break;
            case 1125964206:
                if (!str2.equals(InterestLevel.watched)) {
                    xaj0VarM207578a = xaj0.m207578a(literaturesComments.interestLevel, RequestParameters.SUBRESOURCE_DELETE, map.get(c22545a.f209159a));
                } else {
                    xaj0VarM207578a = xaj0.m207578a(map.get(c22545a.f209159a), "patch", map.get(c22545a.f209159a));
                }
                break;
            default:
                xaj0VarM207578a = xaj0.m207578a(literaturesComments.interestLevel, RequestParameters.SUBRESOURCE_DELETE, map.get(c22545a.f209159a));
                break;
        }
        if (NullChecker.m81303a(literaturesComments)) {
            act.duringCreated(CoreModule.f17545c.f19682s1.m34366n3(str, literaturesComments.f20434id, (String) xaj0VarM207578a.f191751a, (String) xaj0VarM207578a.f191752b)).subscribe(mkd0.m154956H(new e30() { // from class: l.j53
                @Override // p149l.e30
                public final void call(Object obj) {
                    f30Var.call((Boolean) obj, (String) xaj0VarM207578a.f191753c);
                }
            }, new e30() { // from class: l.k53
                @Override // p149l.e30
                public final void call(Object obj) {
                    BookMoviesDramasHelper.m59436c(f30Var, xaj0VarM207578a, (Throwable) obj);
                }
            }));
        } else {
            act.duringCreated(CoreModule.f17545c.f19682s1.m34373w3(str, (String) xaj0VarM207578a.f191751a)).subscribe(mkd0.m154956H(new e30() { // from class: l.l53
                @Override // p149l.e30
                public final void call(Object obj) {
                    f30Var.call((Boolean) obj, (String) xaj0VarM207578a.f191753c);
                }
            }, new e30() { // from class: l.m53
                @Override // p149l.e30
                public final void call(Object obj) {
                    BookMoviesDramasHelper.m59439f(f30Var, xaj0VarM207578a, (Throwable) obj);
                }
            }));
        }
        WeakReference<c40> weakReference = f38383b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        f38383b.get().m105113b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m59439f(f30 f30Var, xaj0 xaj0Var, Throwable th) {
        f30Var.call(Boolean.FALSE, (String) xaj0Var.f191753c);
        lsi0.m151595y("保存失败，请再试一次");
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [C, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v21, types: [C, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v7, types: [C, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v9, types: [C, java.lang.String] */
    /* JADX INFO: renamed from: g */
    public static xaj0<String, String, String> m59440g(List<LiteraturesComments> list, Literatures literatures, LiteraturesComments literaturesComments) {
        xaj0<String, String, String> xaj0VarM207578a = xaj0.m207578a("", "", "");
        if (NullChecker.m81303a(literaturesComments)) {
            if (!vwb.m200296J(list)) {
                if (!TextUtils.equals(list.get(0).interestLevel, literaturesComments.interestLevel)) {
                    xaj0VarM207578a.f191752b = "both_like";
                    xaj0VarM207578a.f191751a = "都感兴趣";
                } else if (TextUtils.equals(literaturesComments.interestLevel, InterestLevel.to_watch)) {
                    xaj0VarM207578a.f191752b = "both_wish";
                    xaj0VarM207578a.f191751a = "都想看";
                } else if (TextUtils.equals(literaturesComments.interestLevel, InterestLevel.watching)) {
                    xaj0VarM207578a.f191752b = "both_watching";
                    xaj0VarM207578a.f191751a = "都在看";
                } else if (TextUtils.equals(literaturesComments.interestLevel, InterestLevel.watched)) {
                    xaj0VarM207578a.f191752b = "both_watched";
                    xaj0VarM207578a.f191751a = "都看过";
                }
                xaj0VarM207578a.f191753c = "你们都对《" + literatures.title + "》感兴趣";
                return xaj0VarM207578a;
            }
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(literaturesComments.userID);
            String str = (NullChecker.m81303a(userM169430Pa) && userM169430Pa.isFemale()) ? "她" : "他";
            if (TextUtils.equals(literaturesComments.interestLevel, InterestLevel.to_watch)) {
                xaj0VarM207578a.f191752b = "single_wish";
                xaj0VarM207578a.f191753c = String.format("%1$s想看《%2$s》", str, literatures.title);
                return xaj0VarM207578a;
            }
            if (TextUtils.equals(literaturesComments.interestLevel, InterestLevel.watching)) {
                xaj0VarM207578a.f191752b = "single_watching";
                xaj0VarM207578a.f191753c = String.format("%1$s在看《%2$s》", str, literatures.title);
                return xaj0VarM207578a;
            }
            if (TextUtils.equals(literaturesComments.interestLevel, InterestLevel.watched)) {
                xaj0VarM207578a.f191752b = "single_watched";
                xaj0VarM207578a.f191753c = String.format("%1$s看过《%2$s》", str, literatures.title);
            }
        }
        return xaj0VarM207578a;
    }

    /* JADX INFO: renamed from: h */
    public static List<CharSequence> m59441h(String str, LiteraturesComments literaturesComments) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : f38382a.entrySet()) {
            if (!NullChecker.m81303a(literaturesComments) || !TextUtils.equals(literaturesComments.interestLevel, entry.getValue())) {
                if (!TextUtils.equals(str, "movie") || !TextUtils.equals(entry.getValue(), InterestLevel.watching)) {
                    if (NullChecker.m81303a(literaturesComments) || !TextUtils.equals(entry.getValue(), RequestParameters.SUBRESOURCE_DELETE)) {
                        arrayList.add(entry.getKey());
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m59442i(String str) {
        return !TextUtils.isEmpty(str) && NullChecker.m81303a(m59446m(CoreModule.m29931H().userId(), str));
    }

    /* JADX INFO: renamed from: j */
    public static void m59443j(final Act act, final String str, String str2, final f30<Boolean, String> f30Var) {
        List<LiteraturesComments> listM59449p = m59449p(str);
        final LiteraturesComments literaturesComments = !vwb.m200296J(listM59449p) ? listM59449p.get(0) : null;
        if ((NullChecker.m81303a(literaturesComments) || CoreModule.f17545c.f19639e0.m169446U7()) && NullChecker.m81303a(act)) {
            c40 c40VarM105153F = new c40.C16057b(act).m105156I(act.getResources().getString(R$string.f18408c)).m105168U(new View.OnClickListener() { // from class: l.h53
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BookMoviesDramasHelper.m59437d(view);
                }
            }).m105164Q(m59441h(str2, literaturesComments)).m105169V(new c40.InterfaceC16059d() { // from class: l.i53
                @Override // p149l.c40.InterfaceC16059d
                /* JADX INFO: renamed from: a */
                public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                    BookMoviesDramasHelper.m59438e(literaturesComments, act, str, f30Var, vListCell, c22545a, i);
                }
            }).m105153F();
            c40VarM105153F.m105117f();
            f38383b = new WeakReference<>(c40VarM105153F);
        }
    }

    /* JADX INFO: renamed from: k */
    public static List<Literatures> m59444k(List<LiteraturesComments> list) {
        ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(list)) {
            Iterator<LiteraturesComments> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().localLiteratures);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public static List<LiteraturesComments> m59445l(String str) {
        List<LiteraturesComments> listM169489g7;
        if (TextUtils.isEmpty(str)) {
            listM169489g7 = null;
        } else {
            listM169489g7 = CoreModule.f17545c.f19639e0.m169489g7(str);
            if (vwb.m200296J(listM169489g7) && TextUtils.equals(CoreModule.m29931H().userId(), str)) {
                CoreModule.f17545c.f19639e0.m169557x7();
            }
        }
        return vwb.m200296J(listM169489g7) ? new ArrayList() : listM169489g7;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public static LiteraturesComments m59446m(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        List<LiteraturesComments> listM169489g7 = CoreModule.f17545c.f19639e0.m169489g7(str);
        if (vwb.m200296J(listM169489g7)) {
            return null;
        }
        for (LiteraturesComments literaturesComments : listM169489g7) {
            if (TextUtils.equals(literaturesComments.literatureID, str2)) {
                return literaturesComments;
            }
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public static List<LiteraturesComments> m59447n(String str, String str2) {
        return CoreModule.f17545c.f19639e0.m169425O9(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public static LiteraturesComments m59448o(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        List<LiteraturesComments> listM169489g7 = CoreModule.f17545c.f19639e0.m169489g7(str);
        if (vwb.m200296J(listM169489g7)) {
            return null;
        }
        for (LiteraturesComments literaturesComments : listM169489g7) {
            if (TextUtils.equals(literaturesComments.f20434id, str2)) {
                return literaturesComments;
            }
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: p */
    public static List<LiteraturesComments> m59449p(String str) {
        return m59447n(CoreModule.m29931H().userId(), str);
    }
}
