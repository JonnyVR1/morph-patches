package p009l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.pushbubble.SimplePushBubble;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.GreetingBatchPostBody;
import com.p1.mobile.putong.core.data.UserIdType;
import com.p1.mobile.putong.core.ui.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.ark;
import l.e30;
import l.f6c0;
import l.hdb0;
import l.j760;
import l.mkd0;
import l.osi0;
import l.qib0;
import l.roj0;
import l.t100;
import l.u4c0;
import l.upa;
import l.vwb;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class xe40 {

    /* JADX INFO: renamed from: b */
    public static volatile xe40 f22568b;

    /* JADX INFO: renamed from: a */
    public SimplePushBubble f22569a;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m24828c(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: f */
    public static xe40 m24830f() {
        if (f22568b == null) {
            synchronized (xe40.class) {
                try {
                    if (f22568b == null) {
                        f22568b = new xe40();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f22568b;
    }

    /* JADX INFO: renamed from: e */
    public void m24831e() {
        if (NullChecker.a(this.f22569a)) {
            this.f22569a.I();
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m24832g(List list, final Act act, View view) {
        zvf0.u("e_greeting_new_bar", "p_suggest_users_home_view", new j760[]{vwb.Y("to_uid", list.toString())});
        final User userP9 = CoreModule.c.e0.p9();
        if (userP9.isJailed() || userP9.isBannedNew()) {
            CoreModule.K().startJailedDialogLikeAct();
            return;
        }
        if (userP9.isNameFake()) {
            ark.T0(act);
            return;
        }
        if (ark.F0(act, new Runnable() { // from class: l.ue40
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                act2.startActivityForResult(MediaPickerAct.g2(act2, 1, false, false, true, (String) null, MediaPickerAct.D, false, true, userP9.gender), 786);
            }
        })) {
            return;
        }
        this.f22569a.I();
        osi0.g("已向对方欢迎问好");
        GreetingBatchPostBody greetingBatchPostBodyNew_ = GreetingBatchPostBody.new_();
        greetingBatchPostBodyNew_.action = "like";
        greetingBatchPostBodyNew_.userIds = list;
        act.duringCreated(CoreModule.c.V1.g3(greetingBatchPostBodyNew_)).subscribe(mkd0.H(new e30() { // from class: l.ve40
            public final void call(Object obj) {
                xe40.m24828c((roj0) obj);
            }
        }, new e30() { // from class: l.we40
            public final void call(Object obj) {
                osi0.g("网络异常");
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public boolean m24833h() {
        return mqi0.m18550o() > ((Long) CoreModule.c.V1.W.get()).longValue() + TimeUnit.DAYS.toMillis((long) upa.p3());
    }

    /* JADX INFO: renamed from: i */
    public boolean m24834i(CoreSuggested.UserInfo userInfo) {
        if (userInfo == null || !upa.r3() || vwb.J(CoreModule.c.V1.R)) {
            return false;
        }
        Iterator it = CoreModule.c.V1.R.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(((UserIdType) it.next()).userId, userInfo.id)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public void m24835j(final Act act, List<User> list) {
        CoreModule.c.V1.W.put(Long.valueOf(mqi0.m18549n()));
        View viewInflate = act.inflater().inflate(f6c0.l8, (ViewGroup) null);
        qib0.G.Q0(viewInflate.findViewById(u4c0.r4), list.get(0).fp().profileSmall());
        qib0.G.Q0(viewInflate.findViewById(u4c0.Ub), list.get(1).fp().profileSmall());
        qib0.G.Q0(viewInflate.findViewById(u4c0.Xd), list.get(2).fp().profileSmall());
        TextView textView = (TextView) viewInflate.findViewById(u4c0.T1);
        textView.setText(String.format("%d人刚加入探探，欢迎一下他们吧", Integer.valueOf(list.size())));
        this.f22569a = new SimplePushBubble.a(act, viewInflate).y(new ViewGroup.LayoutParams(-1, t100.J)).w(10000).z(CorePopLevel.NEW_USER_GREETING).s();
        hdb0.c().i(this.f22569a);
        final ArrayList arrayList = new ArrayList();
        Iterator<User> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((DbObject) it.next()).id);
        }
        zvf0.A("e_greeting_new_bar", "p_suggest_users_home_view", new j760[]{vwb.Y("to_uid", arrayList.toString())});
        xdl0.E0(viewInflate, new View.OnClickListener() { // from class: l.te40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20632a.m24832g(arrayList, act, view);
            }
        });
    }
}
