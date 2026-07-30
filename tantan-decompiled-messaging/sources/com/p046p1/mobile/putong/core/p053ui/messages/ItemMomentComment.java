package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.Audio;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p149l.a1c0;
import p149l.c3c0;
import p149l.e51;
import p149l.knb0;
import p149l.qib0;
import p149l.t100;
import p149l.ura;
import p149l.vwb;
import p149l.xdl0;
import p149l.y4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMomentComment extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public LinearLayout f31280a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f31281b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f31282c;

    /* JADX INFO: renamed from: d */
    public View f31283d;

    /* JADX INFO: renamed from: e */
    public View f31284e;

    /* JADX INFO: renamed from: f */
    public View f31285f;

    /* JADX INFO: renamed from: g */
    public TextView f31286g;

    /* JADX INFO: renamed from: h */
    public ItemText f31287h;

    /* JADX INFO: renamed from: i */
    public boolean f31288i;

    public ItemMomentComment(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ boolean m48505f(View view) {
        return ItemMessageBase.m48311R(this).onLongClick(view);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        this.f31287h.mo42388A(message);
        this.f31287h.setBackground(getContext().getResources().getDrawable(c3c0.f78610P7));
        Picture picture = null;
        final CoreMomentInfo coreMomentInfo = CoreMomentInfo.LOCAL_ID_INVALID.equals(message.moment) ? null : (CoreMomentInfo) CoreModule.m29934N().mo60295Mh(message.moment, CoreMomentInfo.JSON_ADAPTER);
        this.f31282c.setVisibility(0);
        this.f31285f.setVisibility(8);
        this.f31283d.setVisibility(8);
        this.f31285f.setVisibility(8);
        if (!NullChecker.m81303a(coreMomentInfo)) {
            this.f31280a.setOnClickListener(null);
            this.f31280a.setOnLongClickListener(null);
            xdl0.m208344M(this.f31281b, true);
            xdl0.m208344M(this.f31282c, false);
            this.f31286g.setText("动态已删除");
            return;
        }
        final String strMo60326Ur = CoreModule.m29934N().mo60326Ur(coreMomentInfo.f56008id);
        if (TextUtils.isEmpty(strMo60326Ur)) {
            strMo60326Ur = "word";
        }
        zvf0.m220368A("e_moment_message", OMSDialogPositon.p_chat_view, vwb.m200311Y("moment_id", coreMomentInfo.f56008id), vwb.m200311Y("moment_type", strMo60326Ur));
        xdl0.m208344M(this.f31281b, true);
        this.f31286g.setText(coreMomentInfo.value);
        boolean zM200296J = vwb.m200296J(coreMomentInfo.media);
        VDraweeView vDraweeView = this.f31282c;
        if (zM200296J) {
            vDraweeView.setVisibility(8);
            this.f31283d.setVisibility(8);
            qib0.f154691G.m184725o(this.f31282c);
        } else {
            vDraweeView.getHierarchy().mo112056c(null);
            Media media = coreMomentInfo.media.get(0);
            if (media instanceof Video) {
                this.f31283d.setVisibility(0);
                this.f31283d.setBackgroundResource(c3c0.f78525G3);
                xdl0.m208325C0(this.f31283d, t100.m186890d(30.0f));
                xdl0.m208327D0(t100.m186890d(30.0f), this.f31283d);
                picture = ((Video) media).cover;
            } else {
                boolean z = media instanceof Audio;
                View view = this.f31283d;
                if (z) {
                    view.setVisibility(0);
                    this.f31283d.setBackgroundResource(c3c0.f78471A3);
                    xdl0.m208325C0(this.f31283d, t100.m186890d(16.0f));
                    xdl0.m208327D0(t100.m186890d(16.0f), this.f31283d);
                    this.f31285f.setVisibility(0);
                } else {
                    view.setVisibility(8);
                    if (media instanceof Picture) {
                        picture = (Picture) media;
                    }
                }
            }
            if (media instanceof Audio) {
                this.f31282c.setVisibility(8);
            } else if (NullChecker.m81303a(picture)) {
                qib0.f154691G.m102341Q0(this.f31282c, picture.momentPictureSmall());
            } else {
                qib0.f154691G.m184725o(this.f31282c);
            }
        }
        xdl0.m208329E0(this.f31280a, new View.OnClickListener() { // from class: l.caq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f80044a.m48507e(coreMomentInfo, strMo60326Ur, view2);
            }
        });
        this.f31280a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.daq
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return this.f85254a.m48505f(view2);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return vwb.m200324f0(vwb.m200312Z(getContext().getString(R$string.f20934c), new Runnable() { // from class: l.baq
            @Override // java.lang.Runnable
            public final void run() {
                this.f74711a.m48506d();
            }
        }, Integer.valueOf(c3c0.f78901x1), null));
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m48506d() {
        e51.m114766q(this.f31287h.getText().toString());
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m48507e(CoreMomentInfo coreMomentInfo, String str, View view) {
        zvf0.m220399u("e_moment_message", OMSDialogPositon.p_chat_view, vwb.m200311Y("moment_id", coreMomentInfo.f56008id), vwb.m200311Y("moment_type", str));
        Intent intentArgsToMomentDetailAct = CoreModule.m29934N().argsToMomentDetailAct(getContext(), "chat", coreMomentInfo.f56008id, coreMomentInfo.owner);
        if (intentArgsToMomentDetailAct == null) {
            return;
        }
        getContext().startActivity(intentArgsToMomentDetailAct);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
        this.f31288i = z;
        if (ura.m195053e().m195057d().mo33699I4()) {
            ItemText itemText = this.f31287h;
            if (z) {
                itemText.setLinkTextColor(getResources().getColor(a1c0.f67156j));
            } else {
                itemText.setLinkTextColor(Color.parseColor("#1565C0"));
            }
            this.f31287h.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31284e.setBackgroundResource(c3c0.f78779j5);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31280a = (LinearLayout) findViewById(y4c0.f196081Z);
        this.f31281b = (RelativeLayout) findViewById(y4c0.f196258y2);
        this.f31282c = (VDraweeView) findViewById(y4c0.f196209r2);
        this.f31283d = findViewById(y4c0.f196251x2);
        this.f31285f = findViewById(y4c0.f196157k);
        this.f31286g = (TextView) findViewById(y4c0.f196202q2);
        this.f31287h = (ItemText) findViewById(y4c0.f195933A4);
        this.f31284e = findViewById(y4c0.f196240v5);
    }

    public ItemMomentComment(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemMomentComment(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
