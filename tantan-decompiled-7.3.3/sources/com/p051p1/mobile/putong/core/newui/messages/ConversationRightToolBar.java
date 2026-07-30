package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p051p1.mobile.putong.core.newui.messages.ConversationRightToolBar;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p153l.adc0;
import p153l.bnl0;
import p153l.fdw;
import p153l.gra;
import p153l.i4g0;
import p153l.pcj;
import p153l.pzi0;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationRightToolBar extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final Map<Type, View> f25793a;

    public enum Type {
        loveLetter(new pcj() { // from class: l.lk6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ubw();
            }
        }),
        filter(new pcj() { // from class: l.mk6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new hli();
            }
        }),
        allMatch(new pcj() { // from class: l.nk6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new bj0();
            }
        }),
        search(new pcj() { // from class: l.ok6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new qee0();
            }
        });

        public final pcj<Object> createFun;

        Type(pcj pcjVar) {
            this.createFun = pcjVar;
        }
    }

    public ConversationRightToolBar(Context context) {
        super(context);
        this.f25793a = new HashMap();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m42279b(String str) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m42281d(String str) {
    }

    /* JADX INFO: renamed from: e */
    public void m42282e() {
        Map<Type, View> map = this.f25793a;
        Type type = Type.loveLetter;
        if (map.containsKey(type) && NullChecker.m82486a(this.f25793a.get(type))) {
            final View view = this.f25793a.get(type);
            if (NullChecker.m82487b(view)) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                viewPropertyAnimatorAnimate.scaleX(0.8f).scaleY(0.875f).setDuration(200L);
                viewPropertyAnimatorAnimate.withEndAction(new Runnable() { // from class: l.ik6
                    @Override // java.lang.Runnable
                    public final void run() {
                        view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200L).start();
                    }
                });
                viewPropertyAnimatorAnimate.start();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m42283f() {
        return gra.m131563F0() && !gra.m131672d3();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m42284g(View view, int i, View view2) {
        fdw.m125140g((Act) getContext(), "");
        fdw.m125139e().f98513b.put(Boolean.FALSE);
        bnl0.m105524M(view.findViewById(adc0.f70016M7), false);
        i4g0.m138520r("e_love_letter", i == 0 ? OMSDialogPositon.p_messages_view : "p_new_match");
    }

    public View getAllMatchView() {
        Map<Type, View> map = this.f25793a;
        Type type = Type.allMatch;
        if (!map.containsKey(type)) {
            return null;
        }
        View view = this.f25793a.get(type);
        if (NullChecker.m82486a(view)) {
            return view;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public void m42285h(boolean z) {
        View view;
        Map<Type, View> map = this.f25793a;
        Type type = Type.loveLetter;
        if (map.containsKey(type) && NullChecker.m82486a(this.f25793a.get(type)) && (view = this.f25793a.get(type)) != null) {
            bnl0.m105524M(view.findViewById(adc0.f70016M7), z);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m42286i(final int i, LoveLetterEntryInfo loveLetterEntryInfo) {
        Map<Type, View> map = this.f25793a;
        Type type = Type.loveLetter;
        if (map.containsKey(type) && NullChecker.m82486a(this.f25793a.get(type))) {
            final View view = this.f25793a.get(type);
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.jk6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f121275a.m42284g(view, i, view2);
                }
            });
            if (!loveLetterEntryInfo.display || loveLetterEntryInfo.endTime <= pzi0.m174454o()) {
                bnl0.m105524M(view, false);
                return;
            }
            fdw.m125139e().m125147k();
            bnl0.m105524M(view, true);
            i4g0.m138526x("e_love_letter", i == 0 ? OMSDialogPositon.p_messages_view : "p_new_match");
        }
    }

    /* JADX INFO: renamed from: j */
    public void m42287j(LoveLetterEntryInfo loveLetterEntryInfo) {
        Map<Type, View> map = this.f25793a;
        Type type = Type.loveLetter;
        if (map.containsKey(type) && NullChecker.m82486a(this.f25793a.get(type))) {
            View viewFindViewById = this.f25793a.get(type).findViewById(adc0.f69999L7);
            C4496a c4496a = new C4496a(getContext());
            C4499d.m21895l().m21899k("love_letter_remaining");
            c4496a.m21848D(String.format(Locale.getDefault(), "你有%d次传递情书机会", Integer.valueOf(loveLetterEntryInfo.count))).m21870l(qa00.m175859d(7.0f)).m21881x(qa00.m175859d(10.0f)).m21873p(90).m21854J(13.0f).m21860b(3000L).m21857M(false).m21862d(new C4496a.b() { // from class: l.kk6
                @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.b
                /* JADX INFO: renamed from: a */
                public final void mo21884a(String str) {
                    ConversationRightToolBar.m42281d(str);
                }
            }).m21874q(C4496a.f16399N);
            C4499d.m21895l().m21908u(c4496a, viewFindViewById, "love_letter_remaining");
        }
    }

    /* JADX INFO: renamed from: k */
    public void m42288k() {
        Map<Type, View> map = this.f25793a;
        Type type = Type.loveLetter;
        if (map.containsKey(type) && NullChecker.m82486a(this.f25793a.get(type))) {
            View view = this.f25793a.get(type);
            if (NullChecker.m82487b(view)) {
                View viewFindViewById = view.findViewById(adc0.f69999L7);
                C4496a c4496a = new C4496a(getContext());
                C4499d.m21895l().m21899k("love_letter_reply");
                c4496a.m21848D("收到对方回应").m21870l(qa00.m175859d(7.0f)).m21881x(qa00.m175859d(10.0f)).m21873p(90).m21854J(13.0f).m21860b(3000L).m21857M(false).m21862d(new C4496a.b() { // from class: l.hk6
                    @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.b
                    /* JADX INFO: renamed from: a */
                    public final void mo21884a(String str) {
                        ConversationRightToolBar.m42279b(str);
                    }
                }).m21874q(C4496a.f16399N);
                C4499d.m21895l().m21908u(c4496a, viewFindViewById, "love_letter_reply");
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m42289l(boolean z) {
        if (m42283f()) {
            Map<Type, View> map = this.f25793a;
            Type type = Type.filter;
            if (map.containsKey(type)) {
                View view = this.f25793a.get(type);
                if (NullChecker.m82486a(view)) {
                    bnl0.m105524M(view, z);
                }
            }
            Map<Type, View> map2 = this.f25793a;
            Type type2 = Type.allMatch;
            if (map2.containsKey(type2)) {
                View view2 = this.f25793a.get(type2);
                if (NullChecker.m82486a(view2)) {
                    bnl0.m105524M(view2, !z);
                }
            }
        }
    }

    public ConversationRightToolBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25793a = new HashMap();
    }

    public ConversationRightToolBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25793a = new HashMap();
    }
}
