package com.p046p1.mobile.putong.core.newui.home.bubble.internalpush;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.data.PushMessage;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import java.util.Map;
import p147v.AutoVDraweeView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.ays;
import p149l.bt0;
import p149l.bym;
import p149l.mep0;
import p149l.qib0;
import p149l.t100;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zxm;

/* JADX INFO: loaded from: classes11.dex */
public class LiveInternalBigStyle1VirtualVoicePushView extends LiveInternalPushBaseView {

    /* JADX INFO: renamed from: s */
    public static final int f22151s = t100.f167257f;

    /* JADX INFO: renamed from: c */
    public FrameLayout f22152c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f22153d;

    /* JADX INFO: renamed from: e */
    public TextView f22154e;

    /* JADX INFO: renamed from: f */
    public VImage f22155f;

    /* JADX INFO: renamed from: g */
    public AnimEffectPlayer f22156g;

    /* JADX INFO: renamed from: h */
    public AutoVDraweeView f22157h;

    /* JADX INFO: renamed from: i */
    public ConstraintLayout f22158i;

    /* JADX INFO: renamed from: j */
    public AutoVDraweeView f22159j;

    /* JADX INFO: renamed from: k */
    public AutoVDraweeView f22160k;

    /* JADX INFO: renamed from: l */
    public TextView f22161l;

    /* JADX INFO: renamed from: m */
    public VText f22162m;

    /* JADX INFO: renamed from: n */
    public VText_Bold f22163n;

    /* JADX INFO: renamed from: o */
    public VButton f22164o;

    /* JADX INFO: renamed from: p */
    public float f22165p;

    /* JADX INFO: renamed from: q */
    public bym f22166q;

    /* JADX INFO: renamed from: r */
    public String f22167r;

    public LiveInternalBigStyle1VirtualVoicePushView(@NonNull Context context) {
        super(context);
        this.f22167r = "https://auto.tancdn.com/v1/images/eyJpZCI6Ilc3MkI0SlNYMzZTUVBFNlpNS1AyT1VYVkNKTzZUSDExIiwidyI6MTQzNiwiaCI6ODY0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NTAwODU2NzkzODk0MTIyMjk4MX0.png";
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: a */
    public boolean mo37830a() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: b */
    public void mo37831b(PushMessage pushMessage, Act act) {
        Map<String, String> map = pushMessage.messageCustomMap;
        this.f22163n.setEllipsize(TextUtils.TruncateAt.END);
        this.f22162m.setText(map.get("title"));
        this.f22163n.setText(map.get("content"));
        if (!TextUtils.isEmpty(map.get("tag1"))) {
            this.f22154e.setText(map.get("tag1"));
        }
        xdl0.m208344M(this.f22158i, false);
        if (!TextUtils.isEmpty(map.get("subTitle"))) {
            xdl0.m208344M(this.f22158i, true);
            mep0.m154302d1(this.f22158i, t100.m186890d(6.0f));
            this.f22161l.setText(map.get("subTitle"));
            String str = map.get("subTitleIcon");
            if (!TextUtils.isEmpty(str)) {
                this.f22160k.setImageUrl(str);
            }
            String str2 = map.get("subTitleBgImage");
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            AutoVDraweeView autoVDraweeView = this.f22159j;
            if (zIsEmpty) {
                autoVDraweeView.setImageResource(x2c0.f189943Z8);
            } else {
                autoVDraweeView.setImageUrl(str2);
            }
        }
        if (!TextUtils.isEmpty(map.get("buttonText"))) {
            this.f22164o.setText(map.get("buttonText"));
        }
        if (TextUtils.isEmpty(map.get("bgImg"))) {
            qib0.f154691G.m102331L0(this.f22153d, this.f22167r);
        } else {
            qib0.f154691G.m102331L0(this.f22153d, map.get("bgImg"));
        }
        if (!TextUtils.isEmpty(map.get("image"))) {
            xdl0.m208344M(this.f22157h, true);
            this.f22157h.setImageUrl(map.get("image"));
            this.f22157h.setOnClickListener(new View.OnClickListener() { // from class: l.xxs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f194909a.m37833g(view);
                }
            });
            if (!TextUtils.isEmpty(map.get("big_pic_url"))) {
                xdl0.m208344M(this.f22156g, true);
                this.f22156g.loadAnimWithListener(map.get("big_pic_url"), -1, null, true);
            }
        }
        this.f22164o.setOnClickListener(new View.OnClickListener() { // from class: l.yxs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200659a.m37834h(view);
            }
        });
        xdl0.m208329E0(this.f22155f, new View.OnClickListener() { // from class: l.zxs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f205485a.m37835i(view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m37832f(View view) {
        ays.m99583a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m37833g(View view) {
        zxm zxmVar;
        bym bymVar = this.f22166q;
        if (bymVar == null || (zxmVar = bymVar.f72298a) == null) {
            return;
        }
        zxmVar.m220844J();
        this.f22166q.mo37886f();
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getHideAnim() {
        Animator animatorM103744q = bt0.m103744q(this, "translationY", 0.0f, -this.f22152c.getLayoutParams().height);
        animatorM103744q.setDuration(400L);
        return animatorM103744q;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getShowAnim() {
        Animator animatorM103744q = bt0.m103744q(this, "translationY", (-this.f22152c.getLayoutParams().height) - getTranslationY(), 0.0f);
        animatorM103744q.setDuration(400L);
        return animatorM103744q;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m37834h(View view) {
        zxm zxmVar;
        bym bymVar = this.f22166q;
        if (bymVar == null || (zxmVar = bymVar.f72298a) == null) {
            return;
        }
        zxmVar.m220844J();
        this.f22166q.mo37886f();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m37835i(View view) {
        this.f22248b.call();
    }

    /* JADX INFO: renamed from: j */
    public LiveInternalPushBaseView m37836j(bym bymVar) {
        this.f22166q = bymVar;
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37832f(this);
        xdl0.m208370d0(this, t100.m186890d(24.0f));
        xdl0.m208372e0(this, t100.m186890d(24.0f));
        xdl0.m208374f0(this, t100.m186890d(50.0f));
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8265s(t100.f167266o);
        this.f22153d.getHierarchy().m112053H(roundingParams);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f22165p = motionEvent.getRawY();
        } else if (action == 2 && this.f22165p - motionEvent.getRawY() > f22151s) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f22247a == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if ((action != 1 && action != 3) || this.f22165p - motionEvent.getRawY() <= f22151s) {
            return super.onTouchEvent(motionEvent);
        }
        this.f22247a.call();
        this.f22247a = null;
        return true;
    }

    public LiveInternalBigStyle1VirtualVoicePushView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22167r = "https://auto.tancdn.com/v1/images/eyJpZCI6Ilc3MkI0SlNYMzZTUVBFNlpNS1AyT1VYVkNKTzZUSDExIiwidyI6MTQzNiwiaCI6ODY0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NTAwODU2NzkzODk0MTIyMjk4MX0.png";
    }

    public LiveInternalBigStyle1VirtualVoicePushView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22167r = "https://auto.tancdn.com/v1/images/eyJpZCI6Ilc3MkI0SlNYMzZTUVBFNlpNS1AyT1VYVkNKTzZUSDExIiwidyI6MTQzNiwiaCI6ODY0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NTAwODU2NzkzODk0MTIyMjk4MX0.png";
    }
}
