package p003l;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.p000p1.mobile.putong.core.p001ui.match.MatchAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.poplevel.PopAction;
import com.p1.mobile.android.ui.poplevel.a;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.newui.home.bubble.MagicBubble;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.p1.mobile.putong.core.ui.vip.picks.act.PicksAct;
import com.p1.mobile.putong.core.ui.vip.picks.view.PicksGuideView;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.aie0;
import l.e51;
import l.f0m;
import l.f6c0;
import l.fdb0;
import l.t100;
import l.v7c0;
import l.zch0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ae70 extends aie0 {

    /* JADX INFO: renamed from: i */
    public final Act f2145i;

    /* JADX INFO: renamed from: j */
    public final User f2146j;

    /* JADX INFO: renamed from: k */
    public final SwipeDirection f2147k;

    /* JADX INFO: renamed from: l */
    public PopupWindow f2148l;

    /* JADX INFO: renamed from: l.ae70$a */
    public class ViewOnTouchListenerC0162a implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public float f2149a;

        /* JADX INFO: renamed from: b */
        public float f2150b;

        public ViewOnTouchListenerC0162a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f2149a = y;
                return false;
            }
            if (action != 1) {
                return false;
            }
            this.f2150b = y;
            if (this.f2149a - y <= t100.h) {
                return false;
            }
            a.p().o(CorePopLevel.PICKS_GUIDE.getOnlyName(), PopAction.USER_CLOSE);
            ae70.this.m2831K();
            return true;
        }
    }

    public ae70(Act act, User user, SwipeDirection swipeDirection) {
        this.f2145i = act;
        this.f2146j = user;
        this.f2147k = swipeDirection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m2827H() {
        a.p().o(CorePopLevel.PICKS_GUIDE.getOnlyName(), PopAction.OTHER_ACTION);
        zvf0.r("e_card_daily_picks_toast", "p_suggest_users_home_view");
        m2831K();
        this.f2145i.startActivity(new Intent((Context) this.f2145i, (Class<?>) PicksAct.class));
    }

    /* JADX INFO: renamed from: A */
    public int m2828A() {
        v9j v9jVar = ((aie0) this).d;
        if (v9jVar == null || ((Boolean) v9jVar.call()).booleanValue()) {
            Act act = this.f2145i;
            if (((act instanceof NewMainAct) || (act instanceof MatchAct)) && !act.isFinishing() && !zch0.a().h()) {
                m2831K();
                PicksGuideView picksGuideViewInflate = this.f2145i.getLayoutInflater().inflate(f6c0.z8, (ViewGroup) null);
                picksGuideViewInflate.e(this.f2146j, this.f2147k, new d30() { // from class: l.xd70
                    @Override // p003l.d30
                    public final void call() {
                        this.f8769a.m2827H();
                    }
                });
                PopupWindow popupWindow = new PopupWindow((View) picksGuideViewInflate, -1, -2);
                this.f2148l = popupWindow;
                popupWindow.setOutsideTouchable(true);
                this.f2148l.setAnimationStyle(v7c0.D);
                this.f2148l.setTouchInterceptor(new ViewOnTouchListenerC0162a());
                this.f2148l.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.yd70
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        this.f9061a.m2829I();
                    }
                });
                if (this.f2145i.isFinishing() || this.f2145i.isDestroyed()) {
                    return 7000;
                }
                zch0.a().k(true);
                this.f2148l.showAtLocation(this.f2145i.findViewById(R.id.content), 49, 0, -t100.q);
                zvf0.x("e_card_daily_picks_toast", "p_suggest_users_home_view");
                e51.H(this.f2145i, new Runnable() { // from class: l.zd70
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9318a.m2830J();
                    }
                }, 6000L);
                return 7000;
            }
        }
        if (NullChecker.a(((fdb0) this).b)) {
            ((fdb0) this).b.call();
        }
        return 0;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m2829I() {
        if (NullChecker.a(((fdb0) this).b)) {
            ((fdb0) this).b.call();
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m2830J() {
        a.p().o(CorePopLevel.PICKS_GUIDE.getOnlyName(), PopAction.AUTO_CLOSE);
        m2831K();
    }

    /* JADX INFO: renamed from: K */
    public void m2831K() {
        PopupWindow popupWindow = this.f2148l;
        if (popupWindow != null) {
            if (popupWindow.isShowing()) {
                zch0.a().k(false);
                this.f2148l.dismiss();
            }
            this.f2148l = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m2832f(boolean z) {
        PopupWindow popupWindow = this.f2148l;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        PopupWindow popupWindow2 = this.f2148l;
        if (z) {
            popupWindow2.getContentView().setTranslationY(0.0f);
            this.f2148l.getContentView().setAlpha(1.0f);
        } else {
            popupWindow2.getContentView().setTranslationY(-4000.0f);
            this.f2148l.getContentView().setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: j */
    public int m2833j() {
        return this.f2145i.hashCode();
    }

    /* JADX INFO: renamed from: m */
    public Act m2834m() {
        return this.f2145i;
    }

    /* JADX INFO: renamed from: n */
    public void m2835n(boolean z) {
        PopupWindow popupWindow = this.f2148l;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f2148l.dismiss();
            return;
        }
        f0m f0mVar = ((aie0) this).f;
        if (f0mVar != null) {
            f0mVar.a(this);
        }
    }

    /* JADX INFO: renamed from: o */
    public String m2836o() {
        return MagicBubble.PICKS_GUIDE_BUBBLE.getGroup();
    }

    /* JADX INFO: renamed from: p */
    public String m2837p() {
        return MagicBubble.PICKS_GUIDE_BUBBLE.getId();
    }
}
