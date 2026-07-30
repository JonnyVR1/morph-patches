package com.p046p1.mobile.putong.live.livingroom.view;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.immomo.svgaplayer.SVGAAnimListenerAdapter;
import com.immomo.svgaplayer.view.MomoLayUpSVGAImageView;
import com.immomo.velib.anim.model.Element;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveSpecialEffectResources;
import com.p046p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p046p1.mobile.putong.live.base.view.XEGiftView;
import com.p046p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p147v.VDraweeView;
import p147v.VText;
import p149l.AbstractC18387m4;
import p149l.aq0;
import p149l.aqe;
import p149l.dqe;
import p149l.dt0;
import p149l.f30;
import p149l.f6l0;
import p149l.fge;
import p149l.hxs;
import p149l.kvc0;
import p149l.ngm;
import p149l.q4l0;
import p149l.qe2;
import p149l.rfd0;
import p149l.spe;
import p149l.sxj;
import p149l.uvr;
import p149l.vwb;
import p149l.wrj;
import p149l.x90;
import p149l.xdl0;
import p149l.ym2;

/* JADX INFO: loaded from: classes5.dex */
public class AdmissionNewMessageView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f51835a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f51836b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f51837c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f51838d;

    /* JADX INFO: renamed from: e */
    public LiveGradientTextView f51839e;

    /* JADX INFO: renamed from: f */
    public VText f51840f;

    /* JADX INFO: renamed from: g */
    public VideoEffectPlayer f51841g;

    /* JADX INFO: renamed from: h */
    public MomoLayUpSVGAImageView f51842h;

    /* JADX INFO: renamed from: i */
    public XEGiftView f51843i;

    /* JADX INFO: renamed from: j */
    public BLiveEnterRoom f51844j;

    /* JADX INFO: renamed from: k */
    public AnimatorSet f51845k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.AdmissionNewMessageView$a */
    public class C12914a extends ym2 {

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.AdmissionNewMessageView$a$a */
        public class a extends qe2 {

            /* JADX INFO: renamed from: a */
            public int f51847a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f51848b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ aq0 f51849c;

            public a(int i, aq0 aq0Var) {
                this.f51848b = i;
                this.f51849c = aq0Var;
            }

            @Override // p149l.qe2, p149l.hr0
            /* JADX INFO: renamed from: a */
            public void mo76385a(@NonNull Drawable drawable, int i) {
                int i2 = this.f51847a;
                if ((i2 != 0 || this.f51848b > 1) && i2 <= i) {
                    this.f51847a = i;
                } else {
                    this.f51849c.stop();
                }
            }

            @Override // p149l.qe2, p149l.hr0
            public void onAnimationStart(@NonNull Drawable drawable) {
                this.f51847a = -1;
            }
        }

        public C12914a() {
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
            aq0 aq0Var = (aq0) animatable;
            aq0Var.m98214j(new a(aq0Var.m98209e(), aq0Var));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.AdmissionNewMessageView$b */
    public class C12915b extends SVGAAnimListenerAdapter {
        public C12915b() {
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter
        public void loadResError(String str) {
            super.loadResError(str);
            xdl0.m208344M(AdmissionNewMessageView.this.f51842h, false);
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
        public void onFinished() {
            super.onFinished();
            xdl0.m208344M(AdmissionNewMessageView.this.f51842h, false);
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
        public void onStart() {
            super.onStart();
            xdl0.m208344M(AdmissionNewMessageView.this.f51842h, true);
        }
    }

    public AdmissionNewMessageView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m76374b(View view) {
        x90.m207458a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m76375c(List<BLiveSpecialEffectResources> list, @Nullable List<Element> list2) {
        if (vwb.m200296J(list) || vwb.m200296J(list2)) {
            return;
        }
        HashMap map = new HashMap(list.size());
        for (BLiveSpecialEffectResources bLiveSpecialEffectResources : list) {
            map.put(bLiveSpecialEffectResources.f44438id, bLiveSpecialEffectResources);
        }
        for (Element element : list2) {
            String id = element.getId();
            BLiveSpecialEffectResources bLiveSpecialEffectResources2 = (BLiveSpecialEffectResources) map.get(id);
            if (map.containsKey(id) && bLiveSpecialEffectResources2 != null) {
                if (bLiveSpecialEffectResources2.typeIsImageUrl()) {
                    element.setUrl(bLiveSpecialEffectResources2.value);
                } else if (bLiveSpecialEffectResources2.typeIsText()) {
                    element.setText(bLiveSpecialEffectResources2.value);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m76376d() {
        AnimatorSet animatorSet = this.f51845k;
        if (animatorSet != null) {
            dt0.m113503C(animatorSet);
        }
        this.f51835a.setBackgroundResource(0);
        VideoEffectPlayer videoEffectPlayer = this.f51841g;
        if (videoEffectPlayer != null) {
            xdl0.m208344M(videoEffectPlayer, false);
            this.f51841g.stop();
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m76377e() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m76378f(BLiveEnterRoom bLiveEnterRoom, q4l0 q4l0Var, BLiveEffect bLiveEffect) {
        if (vwb.m200296J(q4l0Var.m172945b()) || bLiveEnterRoom == null || vwb.m200296J(bLiveEnterRoom.videoEffectExtras)) {
            return;
        }
        m76375c(bLiveEnterRoom.videoEffectExtras, q4l0Var.m172945b());
    }

    /* JADX INFO: renamed from: g */
    public void m76379g(BLiveEnterRoom bLiveEnterRoom, BLiveEffect bLiveEffect) {
        if (uvr.m196087d().m162666E1()) {
            m76382j(bLiveEnterRoom, bLiveEffect);
        } else if ("svga".equals(bLiveEffect.type)) {
            m76380h(bLiveEnterRoom, bLiveEffect);
        } else if ("video".equals(bLiveEffect.type)) {
            m76381i(bLiveEnterRoom, bLiveEffect);
        }
    }

    public String getUid() {
        BLiveEnterRoom bLiveEnterRoom = this.f51844j;
        if (bLiveEnterRoom != null) {
            return bLiveEnterRoom.uid;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m76380h(BLiveEnterRoom bLiveEnterRoom, BLiveEffect bLiveEffect) {
        JSONObject jSONObject;
        if (this.f51842h == null) {
            return;
        }
        AbstractC18387m4 abstractC18387m4M185365d = spe.m185365d("svga");
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("templateUrl", abstractC18387m4M185365d.mo107443b(aqe.m98261i().m98266h(bLiveEffect.f44359id)));
            } catch (JSONException unused) {
                wrj.m205194A(bLiveEffect);
            }
        } catch (JSONException unused2) {
            jSONObject = null;
        }
        this.f51842h.clearInsertData();
        this.f51842h.startSVGAAnimWithLayJson(jSONObject.toString(), 1, null, new C12915b());
    }

    /* JADX INFO: renamed from: i */
    public final void m76381i(final BLiveEnterRoom bLiveEnterRoom, BLiveEffect bLiveEffect) {
        f6l0.m119627n(this.f51841g, new dqe(bLiveEffect.f44359id).m113020n(new f30() { // from class: l.w90
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f185288a.m76378f(bLiveEnterRoom, (q4l0) obj, (BLiveEffect) obj2);
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public final void m76382j(BLiveEnterRoom bLiveEnterRoom, BLiveEffect bLiveEffect) {
        fge.m121214r(this.f51843i, new dqe(bLiveEnterRoom.getMixResId()).m113016j(bLiveEnterRoom.dynamicEffectExtends).m113017k(bLiveEnterRoom.videoEffectExtras));
    }

    /* JADX INFO: renamed from: k */
    public final void m76383k(BLiveEnterRoom bLiveEnterRoom) {
        hxs.m133410w("context_livingAct", this.f51836b, bLiveEnterRoom.newFloatingUrl, new C12914a());
    }

    /* JADX INFO: renamed from: l */
    public void m76384l(BLiveEnterRoom bLiveEnterRoom) {
        if (bLiveEnterRoom == null) {
            return;
        }
        this.f51844j = bLiveEnterRoom;
        hxs.m133406s("context_livingAct", this.f51835a, bLiveEnterRoom.fixedBackgroundUrl);
        boolean zIsEmpty = TextUtils.isEmpty(bLiveEnterRoom.userGradeIcon);
        VDraweeView vDraweeView = this.f51837c;
        if (zIsEmpty) {
            xdl0.m208344M(vDraweeView, false);
        } else {
            xdl0.m208344M(vDraweeView, true);
            sxj.m186442c(bLiveEnterRoom.userGradeIcon, this.f51837c, sxj.f166797a);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(bLiveEnterRoom.userImage);
        VDraweeView vDraweeView2 = this.f51838d;
        if (zIsEmpty2) {
            xdl0.m208344M(vDraweeView2, false);
            this.f51839e.setMaxEms(7);
        } else {
            xdl0.m208344M(vDraweeView2, true);
            hxs.m133406s("context_livingAct", this.f51838d, bLiveEnterRoom.userImage);
            this.f51839e.setMaxEms(6);
        }
        rfd0.m179126b(this.f51839e, bLiveEnterRoom.userName, kvc0.m147358g(bLiveEnterRoom.userNameColor), bLiveEnterRoom.userNameGradientColors);
        this.f51840f.setText(bLiveEnterRoom.getContentText(getContext()));
        this.f51840f.setTextColor(kvc0.m147358g(bLiveEnterRoom.contentTextColor));
        if (TextUtils.isEmpty(bLiveEnterRoom.newFloatingUrl)) {
            xdl0.m208345M0(this.f51836b, false);
        } else {
            m76383k(bLiveEnterRoom);
            xdl0.m208345M0(this.f51836b, true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76374b(this);
        this.f51841g.setRenderMode(2);
    }

    public void setAnim(AnimatorSet animatorSet) {
        this.f51845k = animatorSet;
    }

    public AdmissionNewMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AdmissionNewMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
