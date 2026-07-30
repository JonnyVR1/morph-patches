package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageMomentGuide;
import com.p046p1.mobile.putong.core.data.ReminderAction;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import java.util.List;
import org.slf4j.Marker;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p149l.knb0;
import p149l.mqi0;
import p149l.nvc0;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.y4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class ItemMomentGuide extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public LinearLayout f31289a;

    /* JADX INFO: renamed from: b */
    public VLinear f31290b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f31291c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f31292d;

    /* JADX INFO: renamed from: e */
    public VRelative f31293e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f31294f;

    /* JADX INFO: renamed from: g */
    public VFrame f31295g;

    /* JADX INFO: renamed from: h */
    public VText f31296h;

    /* JADX INFO: renamed from: i */
    public VRelative f31297i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f31298j;

    /* JADX INFO: renamed from: k */
    public VText f31299k;

    /* JADX INFO: renamed from: l */
    public VText f31300l;

    /* JADX INFO: renamed from: m */
    public VText f31301m;

    public ItemMomentGuide(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        MessageMomentGuide messageMomentGuide;
        String str;
        int i;
        int size;
        String str2;
        try {
            messageMomentGuide = !TextUtils.isEmpty(message.msgData) ? MessageMomentGuide.JSON_ADAPTER.parse(message.msgData) : null;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        boolean zM81303a = NullChecker.m81303a(messageMomentGuide);
        LinearLayout linearLayout = this.f31289a;
        if (!zM81303a) {
            linearLayout.setOnClickListener(null);
            this.f31289a.setOnLongClickListener(null);
            this.f31289a.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        this.f31290b.setVisibility(8);
        this.f31297i.setVisibility(8);
        this.f31299k.setVisibility(8);
        this.f31293e.setVisibility(8);
        this.f31295g.setVisibility(8);
        VText vText = this.f31296h;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f31299k.setTypeface(typeface);
        xdl0.m208360X(this.f31300l, messageMomentGuide.type == 3 ? 0 : t100.m186890d(12.0f));
        this.f31300l.setLines(messageMomentGuide.type == 3 ? 2 : 1);
        boolean zIsEmpty = TextUtils.isEmpty(messageMomentGuide.desc);
        VText vText2 = this.f31300l;
        if (zIsEmpty) {
            vText2.setVisibility(8);
        } else {
            vText2.setVisibility(0);
            this.f31300l.setText(messageMomentGuide.desc);
        }
        VText vText3 = this.f31301m;
        StringBuilder sb = new StringBuilder();
        if (ItemBase.m48031d(new Date((long) messageMomentGuide.createdTime))) {
            str = "";
        } else {
            str = ItemBase.m48029b(messageMomentGuide.createdTime) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        sb.append(str);
        sb.append(mqi0.f135256h.format(Double.valueOf(messageMomentGuide.createdTime)));
        sb.append("发布了");
        vText3.setText(sb.toString());
        final String str3 = messageMomentGuide.f20446id;
        final String str4 = messageMomentGuide.ownerId;
        this.f31289a.setOnLongClickListener(null);
        nvc0 nvc0Var = new nvc0(t100.m186890d(80.0f), t100.m186890d(80.0f));
        if (messageMomentGuide.type != 1 || vwb.m200296J(messageMomentGuide.imageUrlList)) {
            i = 4;
            if (messageMomentGuide.type == 2 && !vwb.m200296J(messageMomentGuide.imageUrlList)) {
                this.f31297i.setVisibility(0);
                qib0.f154691G.m102337O0(this.f31298j, messageMomentGuide.imageUrlList.get(0), true, false, nvc0Var, null);
            } else if (messageMomentGuide.type == 4) {
                this.f31299k.setVisibility(0);
                this.f31299k.setText(messageMomentGuide.audioDuration);
            }
            size = 0;
        } else {
            size = messageMomentGuide.imageUrlList.size();
            this.f31290b.setVisibility(0);
            if (messageMomentGuide.imageUrlList.size() == 1) {
                this.f31291c.setVisibility(0);
                i = 4;
                qib0.f154691G.m102337O0(this.f31291c, messageMomentGuide.imageUrlList.get(0), true, false, nvc0Var, null);
            } else {
                i = 4;
                if (messageMomentGuide.imageUrlList.size() == 2) {
                    this.f31291c.setVisibility(0);
                    this.f31292d.setVisibility(0);
                    qib0.f154691G.m102337O0(this.f31291c, messageMomentGuide.imageUrlList.get(0), true, false, nvc0Var, null);
                    this.f31292d.setVisibility(0);
                    qib0.f154691G.m102337O0(this.f31292d, messageMomentGuide.imageUrlList.get(1), true, false, nvc0Var, null);
                } else if (messageMomentGuide.imageUrlList.size() >= 3) {
                    this.f31291c.setVisibility(0);
                    this.f31292d.setVisibility(0);
                    this.f31293e.setVisibility(0);
                    qib0.f154691G.m102337O0(this.f31291c, messageMomentGuide.imageUrlList.get(0), true, false, nvc0Var, null);
                    this.f31292d.setVisibility(0);
                    qib0.f154691G.m102337O0(this.f31292d, messageMomentGuide.imageUrlList.get(1), true, false, nvc0Var, null);
                    this.f31294f.setVisibility(0);
                    qib0.f154691G.m102337O0(this.f31294f, messageMomentGuide.imageUrlList.get(2), true, false, nvc0Var, null);
                    if (messageMomentGuide.imageUrlList.size() > 3) {
                        this.f31295g.setVisibility(0);
                        this.f31296h.setText(Marker.ANY_NON_NULL_MARKER + (messageMomentGuide.imageUrlList.size() - 3));
                    }
                }
            }
        }
        int i2 = messageMomentGuide.type;
        if (i2 == i) {
            str2 = "voice";
        } else if (i2 == 1) {
            str2 = ReminderAction.photo;
        } else if (i2 == 2) {
            str2 = "video";
        } else {
            str2 = i2 == 3 ? "word" : "";
        }
        final String str5 = messageMomentGuide.videoDuration;
        zvf0.m220368A("e_moment", OMSDialogPositon.p_chat_view, vwb.m200311Y("live_moment_type", "revision"), vwb.m200311Y("moment_id", str3), vwb.m200311Y("moment_photo_numbers", Integer.valueOf(size)), vwb.m200311Y("moment_type", str2), vwb.m200311Y("order", 0), vwb.m200311Y("owner_id", str4), vwb.m200311Y("recommend_tag_type", ""), vwb.m200311Y("report", ""), vwb.m200311Y("video_time", str5));
        final int i3 = size;
        final String str6 = str2;
        xdl0.m208329E0(this.f31289a, new View.OnClickListener() { // from class: l.eaq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90222a.m48509b(str3, i3, str6, str4, str5, view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m48509b(String str, int i, String str2, String str3, String str4, View view) {
        zvf0.m220399u("e_moment", OMSDialogPositon.p_chat_view, vwb.m200311Y("live_moment_type", "revision"), vwb.m200311Y("moment_id", str), vwb.m200311Y("moment_photo_numbers", Integer.valueOf(i)), vwb.m200311Y("moment_type", str2), vwb.m200311Y("order", 0), vwb.m200311Y("owner_id", str3), vwb.m200311Y("recommend_tag_type", ""), vwb.m200311Y("report", ""), vwb.m200311Y("video_time", str4));
        getContext().startActivity(CoreModule.m29934N().argsToPhotoAlbumFeedAct(getContext(), str3, "from_chat", -1, null, 2));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31289a = (LinearLayout) findViewById(y4c0.f196081Z);
        this.f31290b = (VLinear) findViewById(y4c0.f196133g3);
        this.f31291c = (VDraweeView) findViewById(y4c0.f196216s2);
        this.f31292d = (VDraweeView) findViewById(y4c0.f196223t2);
        this.f31293e = (VRelative) findViewById(y4c0.f196237v2);
        this.f31294f = (VDraweeView) findViewById(y4c0.f196230u2);
        this.f31295g = (VFrame) findViewById(y4c0.f196119e3);
        this.f31296h = (VText) findViewById(y4c0.f196126f3);
        this.f31297i = (VRelative) findViewById(y4c0.f196233u5);
        this.f31298j = (VDraweeView) findViewById(y4c0.f195938B2);
        this.f31299k = (VText) findViewById(y4c0.f196171m);
        this.f31300l = (VText) findViewById(y4c0.f195933A4);
        this.f31301m = (VText) findViewById(y4c0.f195966F4);
    }

    public ItemMomentGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemMomentGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
