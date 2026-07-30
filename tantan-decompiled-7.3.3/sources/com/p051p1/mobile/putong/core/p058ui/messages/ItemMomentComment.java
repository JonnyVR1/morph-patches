package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.edc0;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.l51;
import p153l.ovb0;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMomentComment extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public LinearLayout f32128a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f32129b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f32130c;

    /* JADX INFO: renamed from: d */
    public View f32131d;

    /* JADX INFO: renamed from: e */
    public View f32132e;

    /* JADX INFO: renamed from: f */
    public View f32133f;

    /* JADX INFO: renamed from: g */
    public TextView f32134g;

    /* JADX INFO: renamed from: h */
    public ItemText f32135h;

    /* JADX INFO: renamed from: i */
    public boolean f32136i;

    public ItemMomentComment(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ boolean m49688f(View view) {
        return ItemMessageBase.m49494R(this).onLongClick(view);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        this.f32135h.mo43399A(message);
        this.f32135h.setBackground(getContext().getResources().getDrawable(ibc0.f113885P7));
        Picture picture = null;
        final CoreMomentInfo coreMomentInfo = CoreMomentInfo.LOCAL_ID_INVALID.equals(message.moment) ? null : (CoreMomentInfo) CoreModule.m30932N().mo61479Mh(message.moment, CoreMomentInfo.JSON_ADAPTER);
        this.f32130c.setVisibility(0);
        this.f32133f.setVisibility(8);
        this.f32131d.setVisibility(8);
        this.f32133f.setVisibility(8);
        if (!NullChecker.m82486a(coreMomentInfo)) {
            this.f32128a.setOnClickListener(null);
            this.f32128a.setOnLongClickListener(null);
            bnl0.m105524M(this.f32129b, true);
            bnl0.m105524M(this.f32130c, false);
            this.f32134g.setText("动态已删除");
            return;
        }
        final String strMo61510Ur = CoreModule.m30932N().mo61510Ur(coreMomentInfo.f56856id);
        if (TextUtils.isEmpty(strMo61510Ur)) {
            strMo61510Ur = "word";
        }
        i4g0.m138492A("e_moment_message", OMSDialogPositon.p_chat_view, jyb.m147494Y("moment_id", coreMomentInfo.f56856id), jyb.m147494Y("moment_type", strMo61510Ur));
        bnl0.m105524M(this.f32129b, true);
        this.f32134g.setText(coreMomentInfo.value);
        boolean zM147479J = jyb.m147479J(coreMomentInfo.media);
        VDraweeView vDraweeView = this.f32130c;
        if (zM147479J) {
            vDraweeView.setVisibility(8);
            this.f32131d.setVisibility(8);
            uqb0.f180374G.m98798o(this.f32130c);
        } else {
            vDraweeView.getHierarchy().mo118277c(null);
            Media media = coreMomentInfo.media.get(0);
            if (media instanceof Video) {
                this.f32131d.setVisibility(0);
                this.f32131d.setBackgroundResource(ibc0.f113800G3);
                bnl0.m105505C0(this.f32131d, qa00.m175859d(30.0f));
                bnl0.m105507D0(qa00.m175859d(30.0f), this.f32131d);
                picture = ((Video) media).cover;
            } else {
                boolean z = media instanceof Audio;
                View view = this.f32131d;
                if (z) {
                    view.setVisibility(0);
                    this.f32131d.setBackgroundResource(ibc0.f113746A3);
                    bnl0.m105505C0(this.f32131d, qa00.m175859d(16.0f));
                    bnl0.m105507D0(qa00.m175859d(16.0f), this.f32131d);
                    this.f32133f.setVisibility(0);
                } else {
                    view.setVisibility(8);
                    if (media instanceof Picture) {
                        picture = (Picture) media;
                    }
                }
            }
            if (media instanceof Audio) {
                this.f32130c.setVisibility(8);
            } else if (NullChecker.m82486a(picture)) {
                uqb0.f180374G.m127125Q0(this.f32130c, picture.momentPictureSmall());
            } else {
                uqb0.f180374G.m98798o(this.f32130c);
            }
        }
        bnl0.m105509E0(this.f32128a, new View.OnClickListener() { // from class: l.ccq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f80982a.m49690e(coreMomentInfo, strMo61510Ur, view2);
            }
        });
        this.f32128a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.dcq
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return this.f87805a.m49688f(view2);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return jyb.m147507f0(jyb.m147495Z(getContext().getString(R$string.f21676c), new Runnable() { // from class: l.bcq
            @Override // java.lang.Runnable
            public final void run() {
                this.f76194a.m49689d();
            }
        }, Integer.valueOf(ibc0.f114176x1), null));
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m49689d() {
        l51.m152911q(this.f32135h.getText().toString());
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m49690e(CoreMomentInfo coreMomentInfo, String str, View view) {
        i4g0.m138523u("e_moment_message", OMSDialogPositon.p_chat_view, jyb.m147494Y("moment_id", coreMomentInfo.f56856id), jyb.m147494Y("moment_type", str));
        Intent intentArgsToMomentDetailAct = CoreModule.m30932N().argsToMomentDetailAct(getContext(), "chat", coreMomentInfo.f56856id, coreMomentInfo.owner);
        if (intentArgsToMomentDetailAct == null) {
            return;
        }
        getContext().startActivity(intentArgsToMomentDetailAct);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
        this.f32136i = z;
        if (gta.m132210e().m132214d().mo34702I4()) {
            ItemText itemText = this.f32135h;
            if (z) {
                itemText.setLinkTextColor(getResources().getColor(g9c0.f102820j));
            } else {
                itemText.setLinkTextColor(Color.parseColor("#1565C0"));
            }
            this.f32135h.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f32132e.setBackgroundResource(ibc0.f114054j5);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32128a = (LinearLayout) findViewById(edc0.f93316Z);
        this.f32129b = (RelativeLayout) findViewById(edc0.f93493y2);
        this.f32130c = (VDraweeView) findViewById(edc0.f93444r2);
        this.f32131d = findViewById(edc0.f93486x2);
        this.f32133f = findViewById(edc0.f93392k);
        this.f32134g = (TextView) findViewById(edc0.f93437q2);
        this.f32135h = (ItemText) findViewById(edc0.f93168A4);
        this.f32132e = findViewById(edc0.f93475v5);
    }

    public ItemMomentComment(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemMomentComment(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
