package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageMomentGuide;
import com.p051p1.mobile.putong.core.data.ReminderAction;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import java.util.List;
import org.slf4j.Marker;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.edc0;
import p153l.i4g0;
import p153l.jyb;
import p153l.ovb0;
import p153l.pzi0;
import p153l.q3d0;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class ItemMomentGuide extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public LinearLayout f32137a;

    /* JADX INFO: renamed from: b */
    public VLinear f32138b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f32139c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f32140d;

    /* JADX INFO: renamed from: e */
    public VRelative f32141e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f32142f;

    /* JADX INFO: renamed from: g */
    public VFrame f32143g;

    /* JADX INFO: renamed from: h */
    public VText f32144h;

    /* JADX INFO: renamed from: i */
    public VRelative f32145i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f32146j;

    /* JADX INFO: renamed from: k */
    public VText f32147k;

    /* JADX INFO: renamed from: l */
    public VText f32148l;

    /* JADX INFO: renamed from: m */
    public VText f32149m;

    public ItemMomentGuide(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        MessageMomentGuide messageMomentGuide;
        String str;
        int i;
        int size;
        String str2;
        try {
            messageMomentGuide = !TextUtils.isEmpty(message.msgData) ? MessageMomentGuide.JSON_ADAPTER.parse(message.msgData) : null;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        boolean zM82486a = NullChecker.m82486a(messageMomentGuide);
        LinearLayout linearLayout = this.f32137a;
        if (!zM82486a) {
            linearLayout.setOnClickListener(null);
            this.f32137a.setOnLongClickListener(null);
            this.f32137a.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        this.f32138b.setVisibility(8);
        this.f32145i.setVisibility(8);
        this.f32147k.setVisibility(8);
        this.f32141e.setVisibility(8);
        this.f32143g.setVisibility(8);
        VText vText = this.f32144h;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f32147k.setTypeface(typeface);
        bnl0.m105540X(this.f32148l, messageMomentGuide.type == 3 ? 0 : qa00.m175859d(12.0f));
        this.f32148l.setLines(messageMomentGuide.type == 3 ? 2 : 1);
        boolean zIsEmpty = TextUtils.isEmpty(messageMomentGuide.desc);
        VText vText2 = this.f32148l;
        if (zIsEmpty) {
            vText2.setVisibility(8);
        } else {
            vText2.setVisibility(0);
            this.f32148l.setText(messageMomentGuide.desc);
        }
        VText vText3 = this.f32149m;
        StringBuilder sb = new StringBuilder();
        if (ItemBase.m49214d(new Date((long) messageMomentGuide.createdTime))) {
            str = "";
        } else {
            str = ItemBase.m49212b(messageMomentGuide.createdTime) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        sb.append(str);
        sb.append(pzi0.f154861h.format(Double.valueOf(messageMomentGuide.createdTime)));
        sb.append("发布了");
        vText3.setText(sb.toString());
        final String str3 = messageMomentGuide.f21188id;
        final String str4 = messageMomentGuide.ownerId;
        this.f32137a.setOnLongClickListener(null);
        q3d0 q3d0Var = new q3d0(qa00.m175859d(80.0f), qa00.m175859d(80.0f));
        if (messageMomentGuide.type != 1 || jyb.m147479J(messageMomentGuide.imageUrlList)) {
            i = 4;
            if (messageMomentGuide.type == 2 && !jyb.m147479J(messageMomentGuide.imageUrlList)) {
                this.f32145i.setVisibility(0);
                uqb0.f180374G.m127121O0(this.f32146j, messageMomentGuide.imageUrlList.get(0), true, false, q3d0Var, null);
            } else if (messageMomentGuide.type == 4) {
                this.f32147k.setVisibility(0);
                this.f32147k.setText(messageMomentGuide.audioDuration);
            }
            size = 0;
        } else {
            size = messageMomentGuide.imageUrlList.size();
            this.f32138b.setVisibility(0);
            if (messageMomentGuide.imageUrlList.size() == 1) {
                this.f32139c.setVisibility(0);
                i = 4;
                uqb0.f180374G.m127121O0(this.f32139c, messageMomentGuide.imageUrlList.get(0), true, false, q3d0Var, null);
            } else {
                i = 4;
                if (messageMomentGuide.imageUrlList.size() == 2) {
                    this.f32139c.setVisibility(0);
                    this.f32140d.setVisibility(0);
                    uqb0.f180374G.m127121O0(this.f32139c, messageMomentGuide.imageUrlList.get(0), true, false, q3d0Var, null);
                    this.f32140d.setVisibility(0);
                    uqb0.f180374G.m127121O0(this.f32140d, messageMomentGuide.imageUrlList.get(1), true, false, q3d0Var, null);
                } else if (messageMomentGuide.imageUrlList.size() >= 3) {
                    this.f32139c.setVisibility(0);
                    this.f32140d.setVisibility(0);
                    this.f32141e.setVisibility(0);
                    uqb0.f180374G.m127121O0(this.f32139c, messageMomentGuide.imageUrlList.get(0), true, false, q3d0Var, null);
                    this.f32140d.setVisibility(0);
                    uqb0.f180374G.m127121O0(this.f32140d, messageMomentGuide.imageUrlList.get(1), true, false, q3d0Var, null);
                    this.f32142f.setVisibility(0);
                    uqb0.f180374G.m127121O0(this.f32142f, messageMomentGuide.imageUrlList.get(2), true, false, q3d0Var, null);
                    if (messageMomentGuide.imageUrlList.size() > 3) {
                        this.f32143g.setVisibility(0);
                        this.f32144h.setText(Marker.ANY_NON_NULL_MARKER + (messageMomentGuide.imageUrlList.size() - 3));
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
        i4g0.m138492A("e_moment", OMSDialogPositon.p_chat_view, jyb.m147494Y("live_moment_type", "revision"), jyb.m147494Y("moment_id", str3), jyb.m147494Y("moment_photo_numbers", Integer.valueOf(size)), jyb.m147494Y("moment_type", str2), jyb.m147494Y("order", 0), jyb.m147494Y("owner_id", str4), jyb.m147494Y("recommend_tag_type", ""), jyb.m147494Y("report", ""), jyb.m147494Y("video_time", str5));
        final int i3 = size;
        final String str6 = str2;
        bnl0.m105509E0(this.f32137a, new View.OnClickListener() { // from class: l.ecq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93095a.m49692b(str3, i3, str6, str4, str5, view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m49692b(String str, int i, String str2, String str3, String str4, View view) {
        i4g0.m138523u("e_moment", OMSDialogPositon.p_chat_view, jyb.m147494Y("live_moment_type", "revision"), jyb.m147494Y("moment_id", str), jyb.m147494Y("moment_photo_numbers", Integer.valueOf(i)), jyb.m147494Y("moment_type", str2), jyb.m147494Y("order", 0), jyb.m147494Y("owner_id", str3), jyb.m147494Y("recommend_tag_type", ""), jyb.m147494Y("report", ""), jyb.m147494Y("video_time", str4));
        getContext().startActivity(CoreModule.m30932N().argsToPhotoAlbumFeedAct(getContext(), str3, "from_chat", -1, null, 2));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32137a = (LinearLayout) findViewById(edc0.f93316Z);
        this.f32138b = (VLinear) findViewById(edc0.f93368g3);
        this.f32139c = (VDraweeView) findViewById(edc0.f93451s2);
        this.f32140d = (VDraweeView) findViewById(edc0.f93458t2);
        this.f32141e = (VRelative) findViewById(edc0.f93472v2);
        this.f32142f = (VDraweeView) findViewById(edc0.f93465u2);
        this.f32143g = (VFrame) findViewById(edc0.f93354e3);
        this.f32144h = (VText) findViewById(edc0.f93361f3);
        this.f32145i = (VRelative) findViewById(edc0.f93468u5);
        this.f32146j = (VDraweeView) findViewById(edc0.f93173B2);
        this.f32147k = (VText) findViewById(edc0.f93406m);
        this.f32148l = (VText) findViewById(edc0.f93168A4);
        this.f32149m = (VText) findViewById(edc0.f93201F4);
    }

    public ItemMomentGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemMomentGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
