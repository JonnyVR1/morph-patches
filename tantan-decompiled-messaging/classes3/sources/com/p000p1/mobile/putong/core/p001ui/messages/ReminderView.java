package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.p001ui.messages.ReminderView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.Reminder;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.a1c0;
import l.c3c0;
import l.fpc0;
import l.mkd0;
import l.mqi0;
import l.qib0;
import l.ura;
import l.yij0;
import p003l.e30;
import p003l.m250;
import p028v.VDraweeView;
import p028v.VImage;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ReminderView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f1569a;

    /* JADX INFO: renamed from: b */
    public VImage f1570b;

    /* JADX INFO: renamed from: c */
    public VText f1571c;

    /* JADX INFO: renamed from: d */
    public VText f1572d;

    /* JADX INFO: renamed from: e */
    public VImage f1573e;

    /* JADX INFO: renamed from: f */
    public CoreMomentInfo f1574f;

    /* JADX INFO: renamed from: g */
    public Conversation f1575g;

    public ReminderView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2089b(Envelope envelope) {
    }

    /* JADX INFO: renamed from: e */
    public final void m2092e(View view) {
        fpc0.a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m2093f(Throwable th) {
        yij0.D(th);
        m2097j(false);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m2094g(View view) {
        CoreMomentInfo coreMomentInfo = this.f1574f;
        if (coreMomentInfo == null || coreMomentInfo.haveLiked) {
            return;
        }
        m2097j(true);
        FeedService feedServiceN = CoreModule.N();
        String str = ((DbObject) this.f1575g).id;
        CoreMomentInfo coreMomentInfo2 = this.f1574f;
        feedServiceN.coreMomentLike(str, ((CopyObject) coreMomentInfo2).id, true ^ coreMomentInfo2.haveLiked).subscribe((m250) mkd0.H(new e30() { // from class: l.dpc0
            @Override // p003l.e30
            public final void call(Object obj) {
                ReminderView.m2089b((Envelope) obj);
            }
        }, new e30() { // from class: l.epc0
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3353a.m2093f((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m2095h(View view) {
        CoreMomentInfo coreMomentInfo = this.f1574f;
        if (coreMomentInfo == null) {
            return;
        }
        if (!NullChecker.a(coreMomentInfo.media) || this.f1574f.media.size() != 0) {
            getContext().startActivity(CoreModule.N().argsToMomentsFeedPreviewAct(getContext(), ((CopyObject) this.f1574f).id, 0, false, "ReminderView", ((DbObject) this.f1575g).id));
            return;
        }
        Context context = getContext();
        FeedService feedServiceN = CoreModule.N();
        Context context2 = getContext();
        CoreMomentInfo coreMomentInfo2 = this.f1574f;
        context.startActivity(feedServiceN.argsToMomentsSimpleTextAct(context2, ((CopyObject) coreMomentInfo2).id, coreMomentInfo2.owner));
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
    /* JADX INFO: renamed from: i */
    public void m2096i(Conversation conversation) {
        Picture picture;
        Reminder reminder = conversation.reminder;
        if (TEnum.equals(reminder.reference.type, "moment")) {
            this.f1575g = conversation;
            CoreMomentInfo coreMomentInfoMh = CoreModule.N().Mh(reminder.moment, CoreMomentInfo.JSON_ADAPTER);
            this.f1574f = coreMomentInfoMh;
            if (coreMomentInfoMh == null) {
                return;
            }
            this.f1572d.setText(mqi0.l.format(Double.valueOf(coreMomentInfoMh.createdTime)));
            m2097j(this.f1574f.haveLiked);
            boolean zEquals = TEnum.equals(reminder.reference.action, "avatar");
            AppCompatTextView appCompatTextView = this.f1571c;
            if (zEquals) {
                appCompatTextView.setText(R.string.X4);
                this.f1570b.setVisibility(8);
            } else {
                appCompatTextView.setText(!TextUtils.isEmpty(this.f1574f.value) ? this.f1574f.value : getResources().getString(R.string.W4));
            }
            if (!NullChecker.a(this.f1574f.media) || this.f1574f.media.size() <= 0) {
                qib0.G.o(this.f1569a);
                this.f1569a.setVisibility(8);
                this.f1570b.setVisibility(8);
                return;
            }
            Video video = (Media) this.f1574f.media.get(0);
            if (video instanceof Video) {
                picture = video.cover;
                this.f1570b.setVisibility(0);
            } else if (video instanceof Picture) {
                picture = (Picture) video;
                this.f1570b.setVisibility(8);
            } else {
                picture = null;
            }
            if (NullChecker.a(picture)) {
                qib0.G.Q0(this.f1569a, picture.momentPictureSmall());
                this.f1569a.setVisibility(0);
            } else {
                qib0.G.o(this.f1569a);
                this.f1569a.setVisibility(8);
                this.f1570b.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m2097j(boolean z) {
        this.f1573e.setImageResource(z ? c3c0.D7 : c3c0.C7);
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
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2092e(this);
        if (ura.e().d().I4()) {
            this.f1571c.setTextColor(getResources().getColor(a1c0.g));
            this.f1572d.setTextColor(getResources().getColor(a1c0.i));
        }
        this.f1573e.setOnClickListener(new View.OnClickListener() { // from class: l.bpc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2420a.m2094g(view);
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: l.cpc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2743a.m2095h(view);
            }
        });
    }

    public ReminderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ReminderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
