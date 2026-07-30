package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.pushbubble.SimplePushBubble;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.GreetingBatchPostBody;
import com.p051p1.mobile.putong.core.data.UserIdType;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes11.dex */
public class ln40 {

    /* JADX INFO: renamed from: b */
    public static volatile ln40 f132739b;

    /* JADX INFO: renamed from: a */
    public SimplePushBubble f132740a;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m154954c(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: f */
    public static ln40 m154956f() {
        if (f132739b == null) {
            synchronized (ln40.class) {
                try {
                    if (f132739b == null) {
                        f132739b = new ln40();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f132739b;
    }

    /* JADX INFO: renamed from: e */
    public void m154957e() {
        if (NullChecker.m82486a(this.f132740a)) {
            this.f132740a.m22134I();
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m154958g(List list, final Act act, View view) {
        i4g0.m138523u("e_greeting_new_bar", "p_suggest_users_home_view", jyb.m147494Y("to_uid", list.toString()));
        final User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9.isJailed() || userM116600p9.isBannedNew()) {
            CoreModule.m30930K().startJailedDialogLikeAct();
            return;
        }
        if (userM116600p9.isNameFake()) {
            qtk.m177999T0(act);
            return;
        }
        if (qtk.m177971F0(act, new Runnable() { // from class: l.in40
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                act2.startActivityForResult(MediaPickerAct.m48968h2(act2, 1, false, false, true, null, MediaPickerAct.f31471D, false, true, userM116600p9.gender), PutongAct.REQUEST_CODE_PICKER);
            }
        })) {
            return;
        }
        this.f132740a.m22134I();
        r1j0.m179420g("已向对方欢迎问好");
        GreetingBatchPostBody greetingBatchPostBodyNew_ = GreetingBatchPostBody.new_();
        greetingBatchPostBodyNew_.action = "like";
        greetingBatchPostBodyNew_.userIds = list;
        act.duringCreated(CoreModule.f18264c.f20356V1.m170551g3(greetingBatchPostBodyNew_)).subscribe(psd0.m173597H(new y20() { // from class: l.jn40
            @Override // p153l.y20
            public final void call(Object obj) {
                ln40.m154954c((uxj0) obj);
            }
        }, new y20() { // from class: l.kn40
            @Override // p153l.y20
            public final void call(Object obj) {
                r1j0.m179420g("网络异常");
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public boolean m154959h() {
        return pzi0.m174454o() > CoreModule.f18264c.f20356V1.f150520W.get().longValue() + TimeUnit.DAYS.toMillis((long) gra.m131732p3());
    }

    /* JADX INFO: renamed from: i */
    public boolean m154960i(CoreSuggested.UserInfo userInfo) {
        if (userInfo == null || !gra.m131742r3() || jyb.m147479J(CoreModule.f18264c.f20356V1.f150515R)) {
            return false;
        }
        Iterator<UserIdType> it = CoreModule.f18264c.f20356V1.f150515R.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().userId, userInfo.f20214id)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public void m154961j(final Act act, List<User> list) {
        CoreModule.f18264c.f20356V1.f150520W.put(Long.valueOf(pzi0.m174453n()));
        View viewInflate = act.inflater().inflate(kec0.f126050s8, (ViewGroup) null);
        uqb0.f180374G.m127125Q0((VDraweeView) viewInflate.findViewById(adc0.f70569t4), list.get(0).m61308fp().profileSmall());
        uqb0.f180374G.m127125Q0((VDraweeView) viewInflate.findViewById(adc0.f70190Wb), list.get(1).m61308fp().profileSmall());
        uqb0.f180374G.m127125Q0((VDraweeView) viewInflate.findViewById(adc0.f70257ae), list.get(2).m61308fp().profileSmall());
        TextView textView = (TextView) viewInflate.findViewById(adc0.f70129T1);
        textView.setText(String.format("%d人刚加入探探，欢迎一下他们吧", Integer.valueOf(list.size())));
        this.f132740a = new SimplePushBubble.C4523a(act, viewInflate).m22174y(new ViewGroup.LayoutParams(-1, qa00.f156297J)).m22172w(10000).m22175z(CorePopLevel.NEW_USER_GREETING).m22168s();
        llb0.m154703c().m154710i(this.f132740a);
        final ArrayList arrayList = new ArrayList();
        Iterator<User> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f56859id);
        }
        i4g0.m138492A("e_greeting_new_bar", "p_suggest_users_home_view", jyb.m147494Y("to_uid", arrayList.toString()));
        bnl0.m105509E0(viewInflate, new View.OnClickListener() { // from class: l.hn40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f110700a.m154958g(arrayList, act, view);
            }
        });
    }
}
