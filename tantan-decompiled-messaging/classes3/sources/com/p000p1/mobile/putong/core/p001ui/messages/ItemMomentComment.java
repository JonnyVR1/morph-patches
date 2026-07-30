package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Audio;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.a1c0;
import l.c3c0;
import l.e51;
import l.j760;
import l.knb0;
import l.qib0;
import l.t100;
import l.ura;
import l.vwb;
import l.xdl0;
import l.y4c0;
import l.zvf0;
import p028v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemMomentComment extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public LinearLayout f1171a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f1172b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f1173c;

    /* JADX INFO: renamed from: d */
    public View f1174d;

    /* JADX INFO: renamed from: e */
    public View f1175e;

    /* JADX INFO: renamed from: f */
    public View f1176f;

    /* JADX INFO: renamed from: g */
    public TextView f1177g;

    /* JADX INFO: renamed from: h */
    public ItemText f1178h;

    /* JADX INFO: renamed from: i */
    public boolean f1179i;

    public ItemMomentComment(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ boolean m1589f(View view) {
        return ItemMessageBase.m1395R(this).onLongClick(view);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        this.f1178h.mo1056A(message);
        this.f1178h.setBackground(getContext().getResources().getDrawable(c3c0.P7));
        Picture picture = null;
        final CopyObject copyObject = CoreMomentInfo.LOCAL_ID_INVALID.equals(message.moment) ? null : (CoreMomentInfo) CoreModule.N().Mh(message.moment, CoreMomentInfo.JSON_ADAPTER);
        this.f1173c.setVisibility(0);
        this.f1176f.setVisibility(8);
        this.f1174d.setVisibility(8);
        this.f1176f.setVisibility(8);
        if (!NullChecker.a(copyObject)) {
            this.f1171a.setOnClickListener(null);
            this.f1171a.setOnLongClickListener(null);
            xdl0.M(this.f1172b, true);
            xdl0.M(this.f1173c, false);
            this.f1177g.setText("动态已删除");
            return;
        }
        final String strUr = CoreModule.N().Ur(copyObject.id);
        if (TextUtils.isEmpty(strUr)) {
            strUr = "word";
        }
        zvf0.A("e_moment_message", "p_chat_view", new j760[]{vwb.Y("moment_id", copyObject.id), vwb.Y("moment_type", strUr)});
        xdl0.M(this.f1172b, true);
        this.f1177g.setText(((CoreMomentInfo) copyObject).value);
        boolean zJ = vwb.J(((CoreMomentInfo) copyObject).media);
        SimpleDraweeView simpleDraweeView = this.f1173c;
        if (zJ) {
            simpleDraweeView.setVisibility(8);
            this.f1174d.setVisibility(8);
            qib0.G.o(this.f1173c);
        } else {
            simpleDraweeView.getHierarchy().c((Drawable) null);
            Video video = (Media) ((CoreMomentInfo) copyObject).media.get(0);
            if (video instanceof Video) {
                this.f1174d.setVisibility(0);
                this.f1174d.setBackgroundResource(c3c0.G3);
                xdl0.C0(this.f1174d, t100.d(30.0f));
                xdl0.D0(t100.d(30.0f), new View[]{this.f1174d});
                picture = video.cover;
            } else {
                boolean z = video instanceof Audio;
                View view = this.f1174d;
                if (z) {
                    view.setVisibility(0);
                    this.f1174d.setBackgroundResource(c3c0.A3);
                    xdl0.C0(this.f1174d, t100.d(16.0f));
                    xdl0.D0(t100.d(16.0f), new View[]{this.f1174d});
                    this.f1176f.setVisibility(0);
                } else {
                    view.setVisibility(8);
                    if (video instanceof Picture) {
                        picture = (Picture) video;
                    }
                }
            }
            if (video instanceof Audio) {
                this.f1173c.setVisibility(8);
            } else if (NullChecker.a(picture)) {
                qib0.G.Q0(this.f1173c, picture.momentPictureSmall());
            } else {
                qib0.G.o(this.f1173c);
            }
        }
        xdl0.E0(this.f1171a, new View.OnClickListener() { // from class: l.caq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f2600a.m1591e(copyObject, strUr, view2);
            }
        });
        this.f1171a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.daq
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return this.f2925a.m1589f(view2);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return vwb.f0(new knb0[]{vwb.Z(getContext().getString(R.string.c), new Runnable() { // from class: l.baq
            @Override // java.lang.Runnable
            public final void run() {
                this.f2365a.m1590d();
            }
        }, Integer.valueOf(c3c0.x1), (Object) null)});
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m1590d() {
        e51.q(this.f1178h.getText().toString());
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m1591e(CoreMomentInfo coreMomentInfo, String str, View view) {
        zvf0.u("e_moment_message", "p_chat_view", new j760[]{vwb.Y("moment_id", ((CopyObject) coreMomentInfo).id), vwb.Y("moment_type", str)});
        Intent intentArgsToMomentDetailAct = CoreModule.N().argsToMomentDetailAct(getContext(), "chat", ((CopyObject) coreMomentInfo).id, coreMomentInfo.owner);
        if (intentArgsToMomentDetailAct == null) {
            return;
        }
        getContext().startActivity(intentArgsToMomentDetailAct);
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
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
        this.f1179i = z;
        if (ura.e().d().I4()) {
            AppCompatTextView appCompatTextView = this.f1178h;
            if (z) {
                appCompatTextView.setLinkTextColor(getResources().getColor(a1c0.j));
            } else {
                appCompatTextView.setLinkTextColor(Color.parseColor("#1565C0"));
            }
            this.f1178h.setTextColor(getResources().getColor(a1c0.g));
            this.f1175e.setBackgroundResource(c3c0.j5);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1171a = (LinearLayout) findViewById(y4c0.Z);
        this.f1172b = (RelativeLayout) findViewById(y4c0.y2);
        this.f1173c = (VDraweeView) findViewById(y4c0.r2);
        this.f1174d = findViewById(y4c0.x2);
        this.f1176f = findViewById(y4c0.k);
        this.f1177g = (TextView) findViewById(y4c0.q2);
        this.f1178h = (ItemText) findViewById(y4c0.A4);
        this.f1175e = findViewById(y4c0.v5);
    }

    public ItemMomentComment(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemMomentComment(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
