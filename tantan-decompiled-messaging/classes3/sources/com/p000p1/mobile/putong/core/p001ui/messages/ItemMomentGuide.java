package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageMomentGuide;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import java.util.List;
import l.j760;
import l.knb0;
import l.mqi0;
import l.nvc0;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.y4c0;
import l.ym2;
import l.zvf0;
import org.slf4j.Marker;
import p028v.VDraweeView;
import p028v.VFrame;
import p028v.VLinear;
import p028v.VRelative;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Deprecated
public class ItemMomentGuide extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public LinearLayout f1180a;

    /* JADX INFO: renamed from: b */
    public VLinear f1181b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f1182c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f1183d;

    /* JADX INFO: renamed from: e */
    public VRelative f1184e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f1185f;

    /* JADX INFO: renamed from: g */
    public VFrame f1186g;

    /* JADX INFO: renamed from: h */
    public VText f1187h;

    /* JADX INFO: renamed from: i */
    public VRelative f1188i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f1189j;

    /* JADX INFO: renamed from: k */
    public VText f1190k;

    /* JADX INFO: renamed from: l */
    public VText f1191l;

    /* JADX INFO: renamed from: m */
    public VText f1192m;

    public ItemMomentGuide(Context context) {
        super(context);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        MessageMomentGuide messageMomentGuide;
        String str;
        int i;
        int size;
        String str2;
        try {
            messageMomentGuide = !TextUtils.isEmpty(message.msgData) ? (MessageMomentGuide) MessageMomentGuide.JSON_ADAPTER.parse(message.msgData) : null;
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        boolean zA = NullChecker.a(messageMomentGuide);
        LinearLayout linearLayout = this.f1180a;
        if (!zA) {
            linearLayout.setOnClickListener(null);
            this.f1180a.setOnLongClickListener(null);
            this.f1180a.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        this.f1181b.setVisibility(8);
        this.f1188i.setVisibility(8);
        this.f1190k.setVisibility(8);
        this.f1184e.setVisibility(8);
        this.f1186g.setVisibility(8);
        AppCompatTextView appCompatTextView = this.f1187h;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        appCompatTextView.setTypeface(typeface);
        this.f1190k.setTypeface(typeface);
        xdl0.X(this.f1191l, messageMomentGuide.type == 3 ? 0 : t100.d(12.0f));
        this.f1191l.setLines(messageMomentGuide.type == 3 ? 2 : 1);
        boolean zIsEmpty = TextUtils.isEmpty(messageMomentGuide.desc);
        AppCompatTextView appCompatTextView2 = this.f1191l;
        if (zIsEmpty) {
            appCompatTextView2.setVisibility(8);
        } else {
            appCompatTextView2.setVisibility(0);
            this.f1191l.setText(messageMomentGuide.desc);
        }
        AppCompatTextView appCompatTextView3 = this.f1192m;
        StringBuilder sb = new StringBuilder();
        if (ItemBase.m1111d(new Date((long) messageMomentGuide.createdTime))) {
            str = "";
        } else {
            str = ItemBase.m1109b(messageMomentGuide.createdTime) + " ";
        }
        sb.append(str);
        sb.append(mqi0.h.format(Double.valueOf(messageMomentGuide.createdTime)));
        sb.append("发布了");
        appCompatTextView3.setText(sb.toString());
        final String str3 = messageMomentGuide.id;
        final String str4 = messageMomentGuide.ownerId;
        this.f1180a.setOnLongClickListener(null);
        nvc0 nvc0Var = new nvc0(t100.d(80.0f), t100.d(80.0f));
        if (messageMomentGuide.type != 1 || vwb.J(messageMomentGuide.imageUrlList)) {
            i = 4;
            if (messageMomentGuide.type == 2 && !vwb.J(messageMomentGuide.imageUrlList)) {
                this.f1188i.setVisibility(0);
                qib0.G.O0(this.f1189j, (String) messageMomentGuide.imageUrlList.get(0), true, false, nvc0Var, (ym2) null);
            } else if (messageMomentGuide.type == 4) {
                this.f1190k.setVisibility(0);
                this.f1190k.setText(messageMomentGuide.audioDuration);
            }
            size = 0;
        } else {
            size = messageMomentGuide.imageUrlList.size();
            this.f1181b.setVisibility(0);
            if (messageMomentGuide.imageUrlList.size() == 1) {
                this.f1182c.setVisibility(0);
                i = 4;
                qib0.G.O0(this.f1182c, (String) messageMomentGuide.imageUrlList.get(0), true, false, nvc0Var, (ym2) null);
            } else {
                i = 4;
                if (messageMomentGuide.imageUrlList.size() == 2) {
                    this.f1182c.setVisibility(0);
                    this.f1183d.setVisibility(0);
                    qib0.G.O0(this.f1182c, (String) messageMomentGuide.imageUrlList.get(0), true, false, nvc0Var, (ym2) null);
                    this.f1183d.setVisibility(0);
                    qib0.G.O0(this.f1183d, (String) messageMomentGuide.imageUrlList.get(1), true, false, nvc0Var, (ym2) null);
                } else if (messageMomentGuide.imageUrlList.size() >= 3) {
                    this.f1182c.setVisibility(0);
                    this.f1183d.setVisibility(0);
                    this.f1184e.setVisibility(0);
                    qib0.G.O0(this.f1182c, (String) messageMomentGuide.imageUrlList.get(0), true, false, nvc0Var, (ym2) null);
                    this.f1183d.setVisibility(0);
                    qib0.G.O0(this.f1183d, (String) messageMomentGuide.imageUrlList.get(1), true, false, nvc0Var, (ym2) null);
                    this.f1185f.setVisibility(0);
                    qib0.G.O0(this.f1185f, (String) messageMomentGuide.imageUrlList.get(2), true, false, nvc0Var, (ym2) null);
                    if (messageMomentGuide.imageUrlList.size() > 3) {
                        this.f1186g.setVisibility(0);
                        this.f1187h.setText(Marker.ANY_NON_NULL_MARKER + (messageMomentGuide.imageUrlList.size() - 3));
                    }
                }
            }
        }
        int i2 = messageMomentGuide.type;
        if (i2 == i) {
            str2 = "voice";
        } else if (i2 == 1) {
            str2 = "photo";
        } else if (i2 == 2) {
            str2 = "video";
        } else {
            str2 = i2 == 3 ? "word" : "";
        }
        final String str5 = messageMomentGuide.videoDuration;
        zvf0.A("e_moment", "p_chat_view", new j760[]{vwb.Y("live_moment_type", "revision"), vwb.Y("moment_id", str3), vwb.Y("moment_photo_numbers", Integer.valueOf(size)), vwb.Y("moment_type", str2), vwb.Y("order", 0), vwb.Y("owner_id", str4), vwb.Y("recommend_tag_type", ""), vwb.Y("report", ""), vwb.Y("video_time", str5)});
        final int i3 = size;
        final String str6 = str2;
        xdl0.E0(this.f1180a, new View.OnClickListener() { // from class: l.eaq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3229a.m1593b(str3, i3, str6, str4, str5, view);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m1593b(String str, int i, String str2, String str3, String str4, View view) {
        zvf0.u("e_moment", "p_chat_view", new j760[]{vwb.Y("live_moment_type", "revision"), vwb.Y("moment_id", str), vwb.Y("moment_photo_numbers", Integer.valueOf(i)), vwb.Y("moment_type", str2), vwb.Y("order", 0), vwb.Y("owner_id", str3), vwb.Y("recommend_tag_type", ""), vwb.Y("report", ""), vwb.Y("video_time", str4)});
        getContext().startActivity(CoreModule.N().argsToPhotoAlbumFeedAct(getContext(), str3, "from_chat", -1, (String) null, 2));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1180a = (LinearLayout) findViewById(y4c0.Z);
        this.f1181b = (VLinear) findViewById(y4c0.g3);
        this.f1182c = (VDraweeView) findViewById(y4c0.s2);
        this.f1183d = (VDraweeView) findViewById(y4c0.t2);
        this.f1184e = (VRelative) findViewById(y4c0.v2);
        this.f1185f = (VDraweeView) findViewById(y4c0.u2);
        this.f1186g = (VFrame) findViewById(y4c0.e3);
        this.f1187h = (VText) findViewById(y4c0.f3);
        this.f1188i = (VRelative) findViewById(y4c0.u5);
        this.f1189j = (VDraweeView) findViewById(y4c0.B2);
        this.f1190k = (VText) findViewById(y4c0.m);
        this.f1191l = (VText) findViewById(y4c0.A4);
        this.f1192m = (VText) findViewById(y4c0.F4);
    }

    public ItemMomentGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemMomentGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
