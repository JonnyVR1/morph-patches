package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p046p1.mobile.putong.core.newui.messages.ConversationRightToolBar;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p149l.hbw;
import p149l.mqi0;
import p149l.t100;
import p149l.u4c0;
import p149l.upa;
import p149l.v9j;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationRightToolBar extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final Map<Type, View> f25051a;

    public enum Type {
        loveLetter(new v9j() { // from class: l.ij6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new w9w();
            }
        }),
        filter(new v9j() { // from class: l.jj6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new kii();
            }
        }),
        allMatch(new v9j() { // from class: l.kj6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new fj0();
            }
        }),
        search(new v9j() { // from class: l.lj6
            @Override // p149l.v9j, java.util.concurrent.Callable
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
        this.f25051a = new HashMap();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m41268b(String str) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m41270d(String str) {
    }

    /* JADX INFO: renamed from: e */
    public void m41271e() {
        Map<Type, View> map = this.f25051a;
        Type type = Type.loveLetter;
        if (map.containsKey(type) && NullChecker.m81303a(this.f25051a.get(type))) {
            final View view = this.f25051a.get(type);
            if (NullChecker.m81304b(view)) {
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
    public final boolean m41272f() {
        return upa.m194632F0() && !upa.m194741d3();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m41273g(View view, int i, View view2) {
        hbw.m130340g((Act) getContext(), "");
        hbw.m130339e().f106969b.put(Boolean.FALSE);
        xdl0.m208344M(view.findViewById(u4c0.f173894K7), false);
        zvf0.m220396r("e_love_letter", i == 0 ? OMSDialogPositon.p_messages_view : "p_new_match");
    }

    public View getAllMatchView() {
        Map<Type, View> map = this.f25051a;
        Type type = Type.allMatch;
        if (!map.containsKey(type)) {
            return null;
        }
        View view = this.f25051a.get(type);
        if (NullChecker.m81303a(view)) {
            return view;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public void m41274h(boolean z) {
        View view;
        Map<Type, View> map = this.f25051a;
        Type type = Type.loveLetter;
        if (map.containsKey(type) && NullChecker.m81303a(this.f25051a.get(type)) && (view = this.f25051a.get(type)) != null) {
            xdl0.m208344M(view.findViewById(u4c0.f173894K7), z);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m41275i(final int i, LoveLetterEntryInfo loveLetterEntryInfo) {
        Map<Type, View> map = this.f25051a;
        Type type = Type.loveLetter;
        if (map.containsKey(type) && NullChecker.m81303a(this.f25051a.get(type))) {
            final View view = this.f25051a.get(type);
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.gj6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f103006a.m41273g(view, i, view2);
                }
            });
            if (!loveLetterEntryInfo.display || loveLetterEntryInfo.endTime <= mqi0.m155944o()) {
                xdl0.m208344M(view, false);
                return;
            }
            hbw.m130339e().m130347k();
            xdl0.m208344M(view, true);
            zvf0.m220402x("e_love_letter", i == 0 ? OMSDialogPositon.p_messages_view : "p_new_match");
        }
    }

    /* JADX INFO: renamed from: j */
    public void m41276j(LoveLetterEntryInfo loveLetterEntryInfo) {
        Map<Type, View> map = this.f25051a;
        Type type = Type.loveLetter;
        if (map.containsKey(type) && NullChecker.m81303a(this.f25051a.get(type))) {
            View viewFindViewById = this.f25051a.get(type).findViewById(u4c0.f173877J7);
            C4345a c4345a = new C4345a(getContext());
            C4348d.m20896l().m20900k("love_letter_remaining");
            c4345a.m20849D(String.format(Locale.getDefault(), "你有%d次传递情书机会", Integer.valueOf(loveLetterEntryInfo.count))).m20871l(t100.m186890d(7.0f)).m20882x(t100.m186890d(10.0f)).m20874p(90).m20855J(13.0f).m20861b(3000L).m20858M(false).m20863d(new C4345a.b() { // from class: l.hj6
                @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.b
                /* JADX INFO: renamed from: a */
                public final void mo20885a(String str) {
                    ConversationRightToolBar.m41270d(str);
                }
            }).m20875q(C4345a.f15680N);
            C4348d.m20896l().m20909u(c4345a, viewFindViewById, "love_letter_remaining");
        }
    }

    /* JADX INFO: renamed from: k */
    public void m41277k() {
        Map<Type, View> map = this.f25051a;
        Type type = Type.loveLetter;
        if (map.containsKey(type) && NullChecker.m81303a(this.f25051a.get(type))) {
            View view = this.f25051a.get(type);
            if (NullChecker.m81304b(view)) {
                View viewFindViewById = view.findViewById(u4c0.f173877J7);
                C4345a c4345a = new C4345a(getContext());
                C4348d.m20896l().m20900k("love_letter_reply");
                c4345a.m20849D("收到对方回应").m20871l(t100.m186890d(7.0f)).m20882x(t100.m186890d(10.0f)).m20874p(90).m20855J(13.0f).m20861b(3000L).m20858M(false).m20863d(new C4345a.b() { // from class: l.ej6
                    @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.b
                    /* JADX INFO: renamed from: a */
                    public final void mo20885a(String str) {
                        ConversationRightToolBar.m41268b(str);
                    }
                }).m20875q(C4345a.f15680N);
                C4348d.m20896l().m20909u(c4345a, viewFindViewById, "love_letter_reply");
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m41278l(boolean z) {
        if (m41272f()) {
            Map<Type, View> map = this.f25051a;
            Type type = Type.filter;
            if (map.containsKey(type)) {
                View view = this.f25051a.get(type);
                if (NullChecker.m81303a(view)) {
                    xdl0.m208344M(view, z);
                }
            }
            Map<Type, View> map2 = this.f25051a;
            Type type2 = Type.allMatch;
            if (map2.containsKey(type2)) {
                View view2 = this.f25051a.get(type2);
                if (NullChecker.m81303a(view2)) {
                    xdl0.m208344M(view2, !z);
                }
            }
        }
    }

    public ConversationRightToolBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25051a = new HashMap();
    }

    public ConversationRightToolBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25051a = new HashMap();
    }
}
