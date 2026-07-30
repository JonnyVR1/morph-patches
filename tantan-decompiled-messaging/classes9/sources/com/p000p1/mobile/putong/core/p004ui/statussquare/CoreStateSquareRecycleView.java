package com.p000p1.mobile.putong.core.p004ui.statussquare;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.recyclerview.SquareRecyclerView;
import com.p000p1.mobile.putong.core.p004ui.statussquare.CoreStateSquareRecycleView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.newui.messages.DiscoveryPager;
import com.p1.mobile.putong.core.ui.onlinematch.SquareDataWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.gf3;
import l.j760;
import l.l80;
import l.mqi0;
import l.zpd0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import p006l.wrf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CoreStateSquareRecycleView extends SquareRecyclerView {

    /* JADX INFO: renamed from: h */
    public static int f6130h;

    /* JADX INFO: renamed from: i */
    public static zpd0 f6131i = new zpd0("last_timestamp_show_state_guide_remaining_state_square_" + CoreModule.m1850H().userId(), 0L);

    /* JADX INFO: renamed from: f */
    public l80<SquareDataWrapper> f6132f;

    /* JADX INFO: renamed from: g */
    public String f6133g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.statussquare.CoreStateSquareRecycleView$a */
    public class C0329a extends l80<SquareDataWrapper> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.statussquare.CoreStateSquareRecycleView$a$a */
        public class a extends ViewPager.m {
            public a() {
            }

            public void onPageScrollStateChanged(int i) {
                super.onPageScrollStateChanged(i);
                if (i == 0) {
                    C0329a.this.o();
                }
            }
        }

        public C0329a() {
        }

        /* JADX INFO: renamed from: f */
        public void m9091f(ViewGroup viewGroup, ViewGroup viewGroup2) {
            DiscoveryPager discoveryPagerM9089a0 = CoreStateSquareRecycleView.this.m9089a0(DiscoveryPager.class, viewGroup);
            if (discoveryPagerM9089a0 == null) {
                return;
            }
            discoveryPagerM9089a0.d(new a());
        }

        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void m9092j(SquareDataWrapper squareDataWrapper, int i) {
            if (squareDataWrapper.e == SquareDataWrapper.Type.momentState) {
                zvf0.A("e_state", "p_state_explore", new j760[]{j760.a("e_state_type", "state"), j760.a("state_id", ((gf3) squareDataWrapper).a.id), j760.a("owner_id", ((gf3) squareDataWrapper).a.owner.id)});
            }
            if (squareDataWrapper.e == SquareDataWrapper.Type.momentChatRoom) {
                zvf0.A("e_live_audio_room_enter", "p_state_explore", new j760[]{j760.a("anchorId", squareDataWrapper.i.userId), j760.a("liveId", squareDataWrapper.i.liveId), j760.a("audio_card_type", "state_explore_bubble"), j760.a("topic_id", squareDataWrapper.i.topicId), j760.a("audio_room_label", ""), j760.a("voice_template", "")});
                zvf0.A("e_state", "p_state_explore", new j760[]{j760.a("e_state_type", "audio_room"), j760.a("refer_source", CoreStateSquareRecycleView.this.f6133g), j760.a("state_id", ""), j760.a("owner_id", squareDataWrapper.i.userId)});
            }
        }

        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public void m9093m(SquareDataWrapper squareDataWrapper, int i, long j, View view) {
            if (NullChecker.a(view) && CoreModule.m1853N().cd() && CoreModule.m1853N().Gc() == null && !view.getLayoutParams().f() && CoreStateSquareRecycleView.this.m9088Z(CoreModule.m1853N().fc())) {
                CoreModule.m1853N().hk((Act) CoreStateSquareRecycleView.this.getContext(), new e30() { // from class: l.rxa
                    public final void call(Object obj) {
                        CoreStateSquareRecycleView.f6131i.put(Long.valueOf(mqi0.o()));
                    }
                });
            }
        }
    }

    public CoreStateSquareRecycleView(@NonNull @NotNull Context context) {
        super(context);
        this.f6132f = new C0329a();
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.quickaudio.recyclerview.SquareRecyclerView
    /* JADX INFO: renamed from: T */
    public void mo7900T(View view, SquareDataWrapper squareDataWrapper, int i, int i2) {
        this.f6132f.h(view, squareDataWrapper, i2);
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.quickaudio.recyclerview.SquareRecyclerView
    /* JADX INFO: renamed from: W */
    public void mo7903W(@NonNull RecyclerView.d0 d0Var) {
        this.f6132f.o();
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.quickaudio.recyclerview.SquareRecyclerView
    /* JADX INFO: renamed from: X */
    public void mo7904X(@NonNull RecyclerView.d0 d0Var) {
        this.f6132f.o();
    }

    /* JADX INFO: renamed from: Z */
    public boolean m9088Z(int i) {
        int i2 = f6130h + 1;
        f6130h = i2;
        return i2 > i && !mqi0.D(((Long) f6131i.get()).longValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a0 */
    public final <T extends View> T m9089a0(Class<T> cls, View view) {
        if (cls.isInstance(view)) {
            return view;
        }
        T t = null;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (cls.isInstance(childAt)) {
                    t = (T) childAt;
                } else if (childAt instanceof ViewGroup) {
                    t = (T) m9089a0(cls, childAt);
                }
                if (t != null) {
                    return t;
                }
            }
        }
        return t;
    }

    public List<SquareDataWrapper> getData() {
        return ((wrf0) getAdapter()).F();
    }

    public void setFrom(String str) {
        ((wrf0) getAdapter()).m26686K(str);
    }

    public void setReferSource(String str) {
        this.f6133g = str;
    }

    public CoreStateSquareRecycleView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6132f = new C0329a();
    }

    public CoreStateSquareRecycleView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6132f = new C0329a();
    }
}
