package p149l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.poplevel.C4371a;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PicVerificationInfo;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import p147v.VImage;

/* JADX INFO: loaded from: classes11.dex */
public class bk0 {

    /* JADX INFO: renamed from: a */
    public static WeakReference<l5j0> f75958a;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m102249a(Act act, View view) {
        m102254f();
        zvf0.m220396r("e_go_verify", "p_suggest_verified_not_certified_alert");
        qp4.m175811q(act);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m102250b(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.m133796e(cwf0Var);
        m102254f();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m102251c(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.m133796e(cwf0Var);
        m102254f();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m102252d(View view) {
        m102254f();
        zvf0.m220396r("e_cancel_btn", "p_suggest_verified_not_certified_alert");
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m102253e(Act act, View view) {
        m102254f();
        pcl0 pcl0VarM2557i0 = act.fragmentManager().m2557i0(TabName.Card.toString());
        if (NullChecker.m81303a(pcl0VarM2557i0) && (pcl0VarM2557i0 instanceof psl)) {
            ((psl) pcl0VarM2557i0).mo38540C1(NewTanFragTag.HOME, null);
        }
        zvf0.m220396r("e_verified_under_review_see_other", "p_suggest_verified_under_review");
    }

    /* JADX INFO: renamed from: f */
    public static void m102254f() {
        if (NullChecker.m81303a(f75958a)) {
            l5j0 l5j0Var = f75958a.get();
            if (NullChecker.m81303a(l5j0Var)) {
                l5j0Var.m101651T();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m102255g(@NonNull Act act) {
        if (!xma.m210071e4() || xma.m210043F3()) {
            return false;
        }
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (verificationCenterM31612k4 == null) {
            m102256h(act);
            return true;
        }
        PicVerificationInfo picVerificationInfo = verificationCenterM31612k4.picVerificationInfo;
        if (picVerificationInfo == null) {
            m102256h(act);
            return true;
        }
        StudentVerificationStatus studentVerificationStatus = picVerificationInfo.status;
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            return false;
        }
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            m102256h(act);
            return true;
        }
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            m102257i(act);
            return true;
        }
        m102256h(act);
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static void m102256h(final Act act) {
        l5j0 l5j0Var = new l5j0(act, v7c0.f180361h);
        f75958a = new WeakReference<>(l5j0Var);
        l5j0Var.setCanceledOnTouchOutside(false);
        l5j0Var.setContentView(f6c0.f95347F0);
        VImage vImage = (VImage) l5j0Var.findViewById(u4c0.f174260g6);
        TextView textView = (TextView) l5j0Var.findViewById(u4c0.f174335ke);
        TextView textView2 = (TextView) l5j0Var.findViewById(u4c0.f174229e9);
        TextView textView3 = (TextView) l5j0Var.findViewById(u4c0.f173716A);
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9.settings) && NullChecker.m81303a(userM169527p9.settings) && !vwb.m200296J(userM169527p9.settings.settingGroups) && NullChecker.m81303a(userM169527p9.settings.settingGroups.get(0).search) && TEnum.equals(userM169527p9.settings.settingGroups.get(0).search.lookingForGender, "female")) {
            vImage.setImageResource(x2c0.f189268Di);
            textView.setText(String.format("完成头像认证，即刻与她们邂逅", new Object[0]));
        } else {
            vImage.setImageResource(x2c0.f189300Ei);
            textView.setText(String.format("完成头像认证，即刻与他们邂逅", new Object[0]));
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_suggest_verified_not_certified_alert", l5j0.class.getName());
        xdl0.m208329E0(textView2, new View.OnClickListener() { // from class: l.wj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bk0.m102249a(act, view);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() { // from class: l.xj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bk0.m102252d(view);
            }
        });
        l5j0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.yj0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                bk0.m102251c(cwf0VarM133794c, dialogInterface);
            }
        });
        if (C4371a.m21100p().m21108I()) {
            C4371a.m21100p().m21103C(CorePopLevel.HOME_AUTH_TAB, act, l5j0Var, ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
        } else {
            wc80.m202636e().m202649q(uc80.m192995a(l5j0Var));
        }
        zvf0.m220402x("e_go_verify", "p_suggest_verified_not_certified_alert");
        zvf0.m220402x("e_cancel_btn", "p_suggest_verified_not_certified_alert");
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: i */
    public static void m102257i(final Act act) {
        l5j0 l5j0Var = new l5j0(act, v7c0.f180361h);
        f75958a = new WeakReference<>(l5j0Var);
        l5j0Var.setCanceledOnTouchOutside(false);
        l5j0Var.setContentView(f6c0.f95363G0);
        TextView textView = (TextView) l5j0Var.findViewById(u4c0.f174246f9);
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_suggest_verified_under_review", l5j0.class.getName());
        xdl0.m208329E0(textView, new View.OnClickListener() { // from class: l.zj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bk0.m102253e(act, view);
            }
        });
        l5j0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ak0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                bk0.m102250b(cwf0VarM133794c, dialogInterface);
            }
        });
        if (C4371a.m21100p().m21108I()) {
            C4371a.m21100p().m21103C(CorePopLevel.HOME_AUTH_TAB, act, l5j0Var, ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
        } else {
            wc80.m202636e().m202649q(uc80.m192995a(l5j0Var));
        }
        zvf0.m220402x("e_verified_under_review_see_other", "p_suggest_verified_under_review");
        i0e.m133797f(cwf0VarM133794c);
    }
}
