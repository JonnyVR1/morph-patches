package p149l;

import android.R;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.android.exoplayer2.PlaybackException;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.poplevel.C4371a;
import com.p046p1.mobile.android.p048ui.poplevel.PopAction;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.bubble.MagicBubble;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.act.PicksAct;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.view.PicksGuideView;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class ae70 extends aie0 {

    /* JADX INFO: renamed from: i */
    public final Act f69014i;

    /* JADX INFO: renamed from: j */
    public final User f69015j;

    /* JADX INFO: renamed from: k */
    public final SwipeDirection f69016k;

    /* JADX INFO: renamed from: l */
    public PopupWindow f69017l;

    /* JADX INFO: renamed from: l.ae70$a */
    public class ViewOnTouchListenerC15589a implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public float f69018a;

        /* JADX INFO: renamed from: b */
        public float f69019b;

        public ViewOnTouchListenerC15589a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f69018a = y;
                return false;
            }
            if (action != 1) {
                return false;
            }
            this.f69019b = y;
            if (this.f69018a - y <= t100.f167259h) {
                return false;
            }
            C4371a.m21100p().m21119o(CorePopLevel.PICKS_GUIDE.getOnlyName(), PopAction.USER_CLOSE);
            ae70.this.m96050K();
            return true;
        }
    }

    public ae70(Act act, User user, SwipeDirection swipeDirection) {
        this.f69014i = act;
        this.f69015j = user;
        this.f69016k = swipeDirection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m96047H() {
        C4371a.m21100p().m21119o(CorePopLevel.PICKS_GUIDE.getOnlyName(), PopAction.OTHER_ACTION);
        zvf0.m220396r("e_card_daily_picks_toast", "p_suggest_users_home_view");
        m96050K();
        this.f69014i.startActivity(new Intent(this.f69014i, (Class<?>) PicksAct.class));
    }

    @Override // p149l.aie0
    /* JADX INFO: renamed from: A */
    public int mo21134A() {
        v9j<Boolean> v9jVar = this.f69975d;
        if (v9jVar == null || v9jVar.call().booleanValue()) {
            Act act = this.f69014i;
            if (((act instanceof NewMainAct) || (act instanceof MatchAct)) && !act.isFinishing() && !zch0.m218024a().m218031h()) {
                m96050K();
                PicksGuideView picksGuideView = (PicksGuideView) this.f69014i.getLayoutInflater().inflate(f6c0.f96114z8, (ViewGroup) null);
                picksGuideView.m56815e(this.f69015j, this.f69016k, new d30() { // from class: l.xd70
                    @Override // p149l.d30
                    public final void call() {
                        this.f192364a.m96047H();
                    }
                });
                PopupWindow popupWindow = new PopupWindow(picksGuideView, -1, -2);
                this.f69017l = popupWindow;
                popupWindow.setOutsideTouchable(true);
                this.f69017l.setAnimationStyle(v7c0.f180349D);
                this.f69017l.setTouchInterceptor(new ViewOnTouchListenerC15589a());
                this.f69017l.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.yd70
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        this.f197525a.m96048I();
                    }
                });
                if (this.f69014i.isFinishing() || this.f69014i.isDestroyed()) {
                    return PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED;
                }
                zch0.m218024a().m218034k(true);
                this.f69017l.showAtLocation(this.f69014i.findViewById(R.id.content), 49, 0, -t100.f167268q);
                zvf0.m220402x("e_card_daily_picks_toast", "p_suggest_users_home_view");
                e51.m114743H(this.f69014i, new Runnable() { // from class: l.zd70
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f202634a.m96049J();
                    }
                }, 6000L);
                return PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED;
            }
        }
        if (NullChecker.m81303a(this.f97025b)) {
            this.f97025b.call();
        }
        return 0;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m96048I() {
        if (NullChecker.m81303a(this.f97025b)) {
            this.f97025b.call();
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m96049J() {
        C4371a.m21100p().m21119o(CorePopLevel.PICKS_GUIDE.getOnlyName(), PopAction.AUTO_CLOSE);
        m96050K();
    }

    /* JADX INFO: renamed from: K */
    public void m96050K() {
        PopupWindow popupWindow = this.f69017l;
        if (popupWindow != null) {
            if (popupWindow.isShowing()) {
                zch0.m218024a().m218034k(false);
                this.f69017l.dismiss();
            }
            this.f69017l = null;
        }
    }

    @Override // p149l.j0m
    /* JADX INFO: renamed from: f */
    public void mo20865f(boolean z) {
        PopupWindow popupWindow = this.f69017l;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        PopupWindow popupWindow2 = this.f69017l;
        if (z) {
            popupWindow2.getContentView().setTranslationY(0.0f);
            this.f69017l.getContentView().setAlpha(1.0f);
        } else {
            popupWindow2.getContentView().setTranslationY(-4000.0f);
            this.f69017l.getContentView().setAlpha(0.0f);
        }
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: j */
    public int mo21138j() {
        return this.f69014i.hashCode();
    }

    @Override // p149l.l0m
    /* JADX INFO: renamed from: m */
    public Act getAct() {
        return this.f69014i;
    }

    @Override // p149l.j0m
    /* JADX INFO: renamed from: n */
    public void mo20872n(boolean z) {
        PopupWindow popupWindow = this.f69017l;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f69017l.dismiss();
            return;
        }
        f0m f0mVar = this.f69977f;
        if (f0mVar != null) {
            f0mVar.mo21109a(this);
        }
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: o */
    public String mo21140o() {
        return MagicBubble.PICKS_GUIDE_BUBBLE.getGroup();
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: p */
    public String getBubbleId() {
        return MagicBubble.PICKS_GUIDE_BUBBLE.getId();
    }
}
