package com.p046p1.mobile.putong.core.p053ui.statussquare;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.messages.DiscoveryPager;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.SquareDataWrapper;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.recyclerview.SquareRecyclerView;
import com.p046p1.mobile.putong.core.p053ui.statussquare.CoreStateSquareRecycleView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p149l.e30;
import p149l.j760;
import p149l.l80;
import p149l.mqi0;
import p149l.zpd0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class CoreStateSquareRecycleView extends SquareRecyclerView {

    /* JADX INFO: renamed from: h */
    public static int f36349h;

    /* JADX INFO: renamed from: i */
    public static zpd0 f36350i = new zpd0("last_timestamp_show_state_guide_remaining_state_square_" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: f */
    public l80<SquareDataWrapper> f36351f;

    /* JADX INFO: renamed from: g */
    public String f36352g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.statussquare.CoreStateSquareRecycleView$a */
    public class C8893a extends l80<SquareDataWrapper> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.statussquare.CoreStateSquareRecycleView$a$a */
        public class a extends ViewPager.C0719m {
            public a() {
            }

            @Override // androidx.viewpager.widget.ViewPager.C0719m, androidx.viewpager.widget.ViewPager.InterfaceC0716j
            public void onPageScrollStateChanged(int i) {
                super.onPageScrollStateChanged(i);
                if (i == 0) {
                    C8893a.this.m148842o();
                }
            }
        }

        public C8893a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: f */
        public void mo55694f(ViewGroup viewGroup, ViewGroup viewGroup2) {
            DiscoveryPager discoveryPager = (DiscoveryPager) CoreStateSquareRecycleView.this.m55692a0(DiscoveryPager.class, viewGroup);
            if (discoveryPager == null) {
                return;
            }
            discoveryPager.m4185d(new a());
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo55695j(SquareDataWrapper squareDataWrapper, int i) {
            if (squareDataWrapper.f32660e == SquareDataWrapper.Type.momentState) {
                zvf0.m220368A("e_state", "p_state_explore", j760.m140076a("e_state_type", "state"), j760.m140076a("state_id", squareDataWrapper.f102323a.f38730id), j760.m140076a("owner_id", squareDataWrapper.f102323a.owner.f38803id));
            }
            if (squareDataWrapper.f32660e == SquareDataWrapper.Type.momentChatRoom) {
                zvf0.m220368A("e_live_audio_room_enter", "p_state_explore", j760.m140076a("anchorId", squareDataWrapper.f32664i.userId), j760.m140076a("liveId", squareDataWrapper.f32664i.liveId), j760.m140076a("audio_card_type", "state_explore_bubble"), j760.m140076a("topic_id", squareDataWrapper.f32664i.topicId), j760.m140076a("audio_room_label", ""), j760.m140076a("voice_template", ""));
                zvf0.m220368A("e_state", "p_state_explore", j760.m140076a("e_state_type", "audio_room"), j760.m140076a("refer_source", CoreStateSquareRecycleView.this.f36352g), j760.m140076a("state_id", ""), j760.m140076a("owner_id", squareDataWrapper.f32664i.userId));
            }
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public void mo55696m(SquareDataWrapper squareDataWrapper, int i, long j, View view) {
            if (NullChecker.m81303a(view) && CoreModule.m29934N().mo60341cd() && CoreModule.m29934N().mo60276Gc() == null && !((RecyclerView.C0578p) view.getLayoutParams()).m3412f() && CoreStateSquareRecycleView.this.m55691Z(CoreModule.m29934N().mo60352fc())) {
                CoreModule.m29934N().mo60356hk((Act) CoreStateSquareRecycleView.this.getContext(), new e30() { // from class: l.rxa
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        CoreStateSquareRecycleView.f36350i.put(Long.valueOf(mqi0.m155944o()));
                    }
                });
            }
        }
    }

    public CoreStateSquareRecycleView(@NonNull @NotNull Context context) {
        super(context);
        this.f36351f = new C8893a();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.quickaudio.recyclerview.SquareRecyclerView
    /* JADX INFO: renamed from: T */
    public void mo54557T(View view, SquareDataWrapper squareDataWrapper, int i, int i2) {
        this.f36351f.m148839h(view, squareDataWrapper, i2);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.quickaudio.recyclerview.SquareRecyclerView
    /* JADX INFO: renamed from: W */
    public void mo54560W(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        this.f36351f.m148842o();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.quickaudio.recyclerview.SquareRecyclerView
    /* JADX INFO: renamed from: X */
    public void mo54561X(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        this.f36351f.m148842o();
    }

    /* JADX INFO: renamed from: Z */
    public boolean m55691Z(int i) {
        int i2 = f36349h + 1;
        f36349h = i2;
        return i2 > i && !mqi0.m155929D(f36350i.get().longValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a0 */
    public final <T extends View> T m55692a0(Class<T> cls, View view) {
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
                    t = (T) m55692a0(cls, childAt);
                }
                if (t != null) {
                    return t;
                }
            }
        }
        return t;
    }

    public List<SquareDataWrapper> getData() {
        return getAdapter().m113265F();
    }

    public void setFrom(String str) {
        getAdapter().m205182K(str);
    }

    public void setReferSource(String str) {
        this.f36352g = str;
    }

    public CoreStateSquareRecycleView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36351f = new C8893a();
    }

    public CoreStateSquareRecycleView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36351f = new C8893a();
    }
}
