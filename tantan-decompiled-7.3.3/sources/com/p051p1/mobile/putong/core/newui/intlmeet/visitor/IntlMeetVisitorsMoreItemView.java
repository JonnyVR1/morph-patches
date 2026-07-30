package com.p051p1.mobile.putong.core.newui.intlmeet.visitor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetVisitorsMoreItemView;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bnl0;
import p153l.cmo;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001c\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorsMoreItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/android/app/Act;", "c", "()Lcom/p1/mobile/android/app/Act;", "Landroid/view/View;", OMSTemplateModeType.view, "b", "(Landroid/view/View;)V", "a", "Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorsMoreItemView;", "get_root", "()Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorsMoreItemView;", "set_root", "(Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorsMoreItemView;)V", "_root", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class IntlMeetVisitorsMoreItemView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public IntlMeetVisitorsMoreItemView _root;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlMeetVisitorsMoreItemView(@NotNull Context context) {
        super(context);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public static void m40521a(IntlMeetVisitorsMoreItemView intlMeetVisitorsMoreItemView, View view) {
        CoreModule.m30933P().m143405a().mo34495eh(intlMeetVisitorsMoreItemView.m40523c());
    }

    /* JADX INFO: renamed from: b */
    public final void m40522b(View view) {
        cmo.m111297a(this, view);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Act m40523c() {
        return (Act) bnl0.m105506D(getContext());
    }

    @NotNull
    public final IntlMeetVisitorsMoreItemView get_root() {
        IntlMeetVisitorsMoreItemView intlMeetVisitorsMoreItemView = this._root;
        if (intlMeetVisitorsMoreItemView != null) {
            return intlMeetVisitorsMoreItemView;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40522b(this);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.bmo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlMeetVisitorsMoreItemView.m40521a(this.f77356a, view);
            }
        });
    }

    public final void set_root(@NotNull IntlMeetVisitorsMoreItemView intlMeetVisitorsMoreItemView) {
        intlMeetVisitorsMoreItemView.getClass();
        this._root = intlMeetVisitorsMoreItemView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlMeetVisitorsMoreItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlMeetVisitorsMoreItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }
}
