package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.messages.ConversationRightToolBar;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import l.t100;
import l.u4c0;
import l.upa;
import l.v9j;
import l.xdl0;
import l.zvf0;
import p009l.hbw;
import p009l.mqi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationRightToolBar extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final Map<Type, View> f3829a;

    public enum Type {
        loveLetter(new v9j() { // from class: l.ij6
            public final Object call() {
                return new w9w();
            }
        }),
        filter(new v9j() { // from class: l.jj6
            public final Object call() {
                return new kii();
            }
        }),
        allMatch(new v9j() { // from class: l.kj6
            public final Object call() {
                return new fj0();
            }
        }),
        search(new v9j() { // from class: l.lj6
            public final Object call() {
                return new l6e0();
            }
        });

        public final v9j<Object> createFun;

        Type(v9j v9jVar) {
            this.createFun = v9jVar;
        }
    }

    public ConversationRightToolBar(Context context) {
        super(context);
        this.f3829a = new HashMap();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m5374b(String str) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m5376d(String str) {
    }

    /* JADX INFO: renamed from: e */
    public void m5377e() {
        Map<Type, View> map = this.f3829a;
        Type type = Type.loveLetter;
        if (map.containsKey(type) && NullChecker.a(this.f3829a.get(type))) {
            final View view = this.f3829a.get(type);
            if (NullChecker.b(view)) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                viewPropertyAnimatorAnimate.scaleX(0.8f).scaleY(0.875f).setDuration(200L);
                viewPropertyAnimatorAnimate.withEndAction(new Runnable() { // from class: l.fj6
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
    public final boolean m5378f() {
        return upa.F0() && !upa.d3();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m5379g(View view, int i, View view2) {
        hbw.m15504g(getContext(), "");
        hbw.m15503e().f13949b.put(Boolean.FALSE);
        xdl0.M(view.findViewById(u4c0.K7), false);
        zvf0.r("e_love_letter", i == 0 ? "p_messages_view" : "p_new_match");
    }

    public View getAllMatchView() {
        Map<Type, View> map = this.f3829a;
        Type type = Type.allMatch;
        if (!map.containsKey(type)) {
            return null;
        }
        View view = this.f3829a.get(type);
        if (NullChecker.a(view)) {
            return view;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public void m5380h(boolean z) {
        View view;
        Map<Type, View> map = this.f3829a;
        Type type = Type.loveLetter;
        if (map.containsKey(type) && NullChecker.a(this.f3829a.get(type)) && (view = this.f3829a.get(type)) != null) {
            xdl0.M(view.findViewById(u4c0.K7), z);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m5381i(final int i, LoveLetterEntryInfo loveLetterEntryInfo) {
        Map<Type, View> map = this.f3829a;
        Type type = Type.loveLetter;
        if (map.containsKey(type) && NullChecker.a(this.f3829a.get(type))) {
            final View view = this.f3829a.get(type);
            xdl0.E0(view, new View.OnClickListener() { // from class: l.gj6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f13597a.m5379g(view, i, view2);
                }
            });
            if (!loveLetterEntryInfo.display || loveLetterEntryInfo.endTime <= mqi0.m18550o()) {
                xdl0.M(view, false);
                return;
            }
            hbw.m15503e().m15511k();
            xdl0.M(view, true);
            zvf0.x("e_love_letter", i == 0 ? "p_messages_view" : "p_new_match");
        }
    }

    /* JADX INFO: renamed from: j */
    public void m5382j(LoveLetterEntryInfo loveLetterEntryInfo) {
        Map<Type, View> map = this.f3829a;
        Type type = Type.loveLetter;
        if (map.containsKey(type) && NullChecker.a(this.f3829a.get(type))) {
            View viewFindViewById = this.f3829a.get(type).findViewById(u4c0.J7);
            a aVar = new a(getContext());
            d.l().k("love_letter_remaining");
            aVar.D(String.format(Locale.getDefault(), "你有%d次传递情书机会", Integer.valueOf(loveLetterEntryInfo.count))).l(t100.d(7.0f)).x(t100.d(10.0f)).p(90).J(13.0f).b(3000L).M(false).d(new a.b() { // from class: l.hj6
                /* JADX INFO: renamed from: a */
                public final void m15860a(String str) {
                    ConversationRightToolBar.m5376d(str);
                }
            }).q(a.N);
            d.l().u(aVar, viewFindViewById, "love_letter_remaining");
        }
    }

    /* JADX INFO: renamed from: k */
    public void m5383k() {
        Map<Type, View> map = this.f3829a;
        Type type = Type.loveLetter;
        if (map.containsKey(type) && NullChecker.a(this.f3829a.get(type))) {
            View view = this.f3829a.get(type);
            if (NullChecker.b(view)) {
                View viewFindViewById = view.findViewById(u4c0.J7);
                a aVar = new a(getContext());
                d.l().k("love_letter_reply");
                aVar.D("收到对方回应").l(t100.d(7.0f)).x(t100.d(10.0f)).p(90).J(13.0f).b(3000L).M(false).d(new a.b() { // from class: l.ej6
                    /* JADX INFO: renamed from: a */
                    public final void m13960a(String str) {
                        ConversationRightToolBar.m5374b(str);
                    }
                }).q(a.N);
                d.l().u(aVar, viewFindViewById, "love_letter_reply");
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m5384l(boolean z) {
        if (m5378f()) {
            Map<Type, View> map = this.f3829a;
            Type type = Type.filter;
            if (map.containsKey(type)) {
                View view = this.f3829a.get(type);
                if (NullChecker.a(view)) {
                    xdl0.M(view, z);
                }
            }
            Map<Type, View> map2 = this.f3829a;
            Type type2 = Type.allMatch;
            if (map2.containsKey(type2)) {
                View view2 = this.f3829a.get(type2);
                if (NullChecker.a(view2)) {
                    xdl0.M(view2, !z);
                }
            }
        }
    }

    public ConversationRightToolBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3829a = new HashMap();
    }

    public ConversationRightToolBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3829a = new HashMap();
    }
}
