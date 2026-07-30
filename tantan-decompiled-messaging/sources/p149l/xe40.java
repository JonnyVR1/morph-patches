package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.pushbubble.SimplePushBubble;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.GreetingBatchPostBody;
import com.p046p1.mobile.putong.core.data.UserIdType;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes11.dex */
public class xe40 {

    /* JADX INFO: renamed from: b */
    public static volatile xe40 f192527b;

    /* JADX INFO: renamed from: a */
    public SimplePushBubble f192528a;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m208507c(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: f */
    public static xe40 m208509f() {
        if (f192527b == null) {
            synchronized (xe40.class) {
                try {
                    if (f192527b == null) {
                        f192527b = new xe40();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f192527b;
    }

    /* JADX INFO: renamed from: e */
    public void m208510e() {
        if (NullChecker.m81303a(this.f192528a)) {
            this.f192528a.m21135I();
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m208511g(List list, final Act act, View view) {
        zvf0.m220399u("e_greeting_new_bar", "p_suggest_users_home_view", vwb.m200311Y("to_uid", list.toString()));
        final User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9.isJailed() || userM169527p9.isBannedNew()) {
            CoreModule.m29932K().startJailedDialogLikeAct();
            return;
        }
        if (userM169527p9.isNameFake()) {
            ark.m98449T0(act);
            return;
        }
        if (ark.m98421F0(act, new Runnable() { // from class: l.ue40
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                act2.startActivityForResult(MediaPickerAct.m47785g2(act2, 1, false, false, true, null, MediaPickerAct.f30623D, false, true, userM169527p9.gender), PutongAct.REQUEST_CODE_PICKER);
            }
        })) {
            return;
        }
        this.f192528a.m21135I();
        osi0.m165783g("已向对方欢迎问好");
        GreetingBatchPostBody greetingBatchPostBodyNew_ = GreetingBatchPostBody.new_();
        greetingBatchPostBodyNew_.action = "like";
        greetingBatchPostBodyNew_.userIds = list;
        act.duringCreated(CoreModule.f17545c.f19614V1.m109897g3(greetingBatchPostBodyNew_)).subscribe(mkd0.m154956H(new e30() { // from class: l.ve40
            @Override // p149l.e30
            public final void call(Object obj) {
                xe40.m208507c((roj0) obj);
            }
        }, new e30() { // from class: l.we40
            @Override // p149l.e30
            public final void call(Object obj) {
                osi0.m165783g("网络异常");
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public boolean m208512h() {
        return mqi0.m155944o() > CoreModule.f17545c.f19614V1.f83484W.get().longValue() + TimeUnit.DAYS.toMillis((long) upa.m194801p3());
    }

    /* JADX INFO: renamed from: i */
    public boolean m208513i(CoreSuggested.UserInfo userInfo) {
        if (userInfo == null || !upa.m194811r3() || vwb.m200296J(CoreModule.f17545c.f19614V1.f83479R)) {
            return false;
        }
        Iterator<UserIdType> it = CoreModule.f17545c.f19614V1.f83479R.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().userId, userInfo.f19472id)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public void m208514j(final Act act, List<User> list) {
        CoreModule.f17545c.f19614V1.f83484W.put(Long.valueOf(mqi0.m155943n()));
        View viewInflate = act.inflater().inflate(f6c0.f95877l8, (ViewGroup) null);
        qib0.f154691G.m102341Q0((VDraweeView) viewInflate.findViewById(u4c0.f174444r4), list.get(0).m60124fp().profileSmall());
        qib0.f154691G.m102341Q0((VDraweeView) viewInflate.findViewById(u4c0.f174067Ub), list.get(1).m60124fp().profileSmall());
        qib0.f154691G.m102341Q0((VDraweeView) viewInflate.findViewById(u4c0.f174117Xd), list.get(2).m60124fp().profileSmall());
        TextView textView = (TextView) viewInflate.findViewById(u4c0.f174041T1);
        textView.setText(String.format("%d人刚加入探探，欢迎一下他们吧", Integer.valueOf(list.size())));
        this.f192528a = new SimplePushBubble.C4372a(act, viewInflate).m21175y(new ViewGroup.LayoutParams(-1, t100.f167235J)).m21173w(10000).m21176z(CorePopLevel.NEW_USER_GREETING).m21169s();
        hdb0.m130575c().m130582i(this.f192528a);
        final ArrayList arrayList = new ArrayList();
        Iterator<User> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f56011id);
        }
        zvf0.m220368A("e_greeting_new_bar", "p_suggest_users_home_view", vwb.m200311Y("to_uid", arrayList.toString()));
        xdl0.m208329E0(viewInflate, new View.OnClickListener() { // from class: l.te40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f169794a.m208511g(arrayList, act, view);
            }
        });
    }
}
