package p153l;

import android.R;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.android.exoplayer2.PlaybackException;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.poplevel.C4522a;
import com.p051p1.mobile.android.p053ui.poplevel.PopAction;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.bubble.MagicBubble;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.act.PicksAct;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.view.PicksGuideView;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class gm70 extends fqe0 {

    /* JADX INFO: renamed from: i */
    public final Act f104930i;

    /* JADX INFO: renamed from: j */
    public final User f104931j;

    /* JADX INFO: renamed from: k */
    public final SwipeDirection f104932k;

    /* JADX INFO: renamed from: l */
    public PopupWindow f104933l;

    /* JADX INFO: renamed from: l.gm70$a */
    public class ViewOnTouchListenerC17248a implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public float f104934a;

        /* JADX INFO: renamed from: b */
        public float f104935b;

        public ViewOnTouchListenerC17248a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f104934a = y;
                return false;
            }
            if (action != 1) {
                return false;
            }
            this.f104935b = y;
            if (this.f104934a - y <= qa00.f156321h) {
                return false;
            }
            C4522a.m22099p().m22118o(CorePopLevel.PICKS_GUIDE.getOnlyName(), PopAction.USER_CLOSE);
            gm70.this.m130746K();
            return true;
        }
    }

    public gm70(Act act, User user, SwipeDirection swipeDirection) {
        this.f104930i = act;
        this.f104931j = user;
        this.f104932k = swipeDirection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m130743H() {
        C4522a.m22099p().m22118o(CorePopLevel.PICKS_GUIDE.getOnlyName(), PopAction.OTHER_ACTION);
        i4g0.m138520r("e_card_daily_picks_toast", "p_suggest_users_home_view");
        m130746K();
        this.f104930i.startActivity(new Intent(this.f104930i, (Class<?>) PicksAct.class));
    }

    @Override // p153l.fqe0
    /* JADX INFO: renamed from: A */
    public int mo22133A() {
        pcj<Boolean> pcjVar = this.f100279d;
        if (pcjVar == null || pcjVar.call().booleanValue()) {
            Act act = this.f104930i;
            if (((act instanceof NewMainAct) || (act instanceof MatchAct)) && !act.isFinishing() && !hlh0.m135741a().m135748h()) {
                m130746K();
                PicksGuideView picksGuideView = (PicksGuideView) this.f104930i.getLayoutInflater().inflate(kec0.f125425G8, (ViewGroup) null);
                picksGuideView.m57998e(this.f104931j, this.f104932k, new x20() { // from class: l.dm70
                    @Override // p153l.x20
                    public final void call() {
                        this.f89612a.m130743H();
                    }
                });
                PopupWindow popupWindow = new PopupWindow(picksGuideView, -1, -2);
                this.f104933l = popupWindow;
                popupWindow.setOutsideTouchable(true);
                this.f104933l.setAnimationStyle(agc0.f71110D);
                this.f104933l.setTouchInterceptor(new ViewOnTouchListenerC17248a());
                this.f104933l.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.em70
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        this.f94626a.m130744I();
                    }
                });
                if (this.f104930i.isFinishing() || this.f104930i.isDestroyed()) {
                    return PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED;
                }
                hlh0.m135741a().m135751k(true);
                this.f104933l.showAtLocation(this.f104930i.findViewById(R.id.content), 49, 0, -qa00.f156330q);
                i4g0.m138526x("e_card_daily_picks_toast", "p_suggest_users_home_view");
                l51.m152888H(this.f104930i, new Runnable() { // from class: l.fm70
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f99733a.m130745J();
                    }
                }, 6000L);
                return PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED;
            }
        }
        if (NullChecker.m82486a(this.f121543b)) {
            this.f121543b.call();
        }
        return 0;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m130744I() {
        if (NullChecker.m82486a(this.f121543b)) {
            this.f121543b.call();
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m130745J() {
        C4522a.m22099p().m22118o(CorePopLevel.PICKS_GUIDE.getOnlyName(), PopAction.AUTO_CLOSE);
        m130746K();
    }

    /* JADX INFO: renamed from: K */
    public void m130746K() {
        PopupWindow popupWindow = this.f104933l;
        if (popupWindow != null) {
            if (popupWindow.isShowing()) {
                hlh0.m135741a().m135751k(false);
                this.f104933l.dismiss();
            }
            this.f104933l = null;
        }
    }

    @Override // p153l.d3m
    /* JADX INFO: renamed from: f */
    public void mo21864f(boolean z) {
        PopupWindow popupWindow = this.f104933l;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        PopupWindow popupWindow2 = this.f104933l;
        if (z) {
            popupWindow2.getContentView().setTranslationY(0.0f);
            this.f104933l.getContentView().setAlpha(1.0f);
        } else {
            popupWindow2.getContentView().setTranslationY(-4000.0f);
            this.f104933l.getContentView().setAlpha(0.0f);
        }
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: j */
    public int mo22137j() {
        return this.f104930i.hashCode();
    }

    @Override // p153l.f3m
    /* JADX INFO: renamed from: m */
    public Act getAct() {
        return this.f104930i;
    }

    @Override // p153l.d3m
    /* JADX INFO: renamed from: n */
    public void mo21871n(boolean z) {
        PopupWindow popupWindow = this.f104933l;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f104933l.dismiss();
            return;
        }
        z2m z2mVar = this.f100281f;
        if (z2mVar != null) {
            z2mVar.mo22108a(this);
        }
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: o */
    public String mo22139o() {
        return MagicBubble.PICKS_GUIDE_BUBBLE.getGroup();
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: p */
    public String getBubbleId() {
        return MagicBubble.PICKS_GUIDE_BUBBLE.getId();
    }
}
