package com.p051p1.mobile.putong.core.p058ui.statussquare;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.messages.DiscoveryPager;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.SquareDataWrapper;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.recyclerview.SquareRecyclerView;
import com.p051p1.mobile.putong.core.p058ui.statussquare.CoreStateSquareRecycleView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p153l.byd0;
import p153l.h80;
import p153l.i4g0;
import p153l.pf60;
import p153l.pzi0;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class CoreStateSquareRecycleView extends SquareRecyclerView {

    /* JADX INFO: renamed from: h */
    public static int f37197h;

    /* JADX INFO: renamed from: i */
    public static byd0 f37198i = new byd0("last_timestamp_show_state_guide_remaining_state_square_" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: f */
    public h80<SquareDataWrapper> f37199f;

    /* JADX INFO: renamed from: g */
    public String f37200g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.statussquare.CoreStateSquareRecycleView$a */
    public class C9056a extends h80<SquareDataWrapper> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.statussquare.CoreStateSquareRecycleView$a$a */
        public class a extends ViewPager.C0721m {
            public a() {
            }

            @Override // androidx.viewpager.widget.ViewPager.C0721m, androidx.viewpager.widget.ViewPager.InterfaceC0718j
            public void onPageScrollStateChanged(int i) {
                super.onPageScrollStateChanged(i);
                if (i == 0) {
                    C9056a.this.m133884o();
                }
            }
        }

        public C9056a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: f */
        public void mo56877f(ViewGroup viewGroup, ViewGroup viewGroup2) {
            DiscoveryPager discoveryPager = (DiscoveryPager) CoreStateSquareRecycleView.this.m56875a0(DiscoveryPager.class, viewGroup);
            if (discoveryPager == null) {
                return;
            }
            discoveryPager.m4187d(new a());
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo56878j(SquareDataWrapper squareDataWrapper, int i) {
            if (squareDataWrapper.f33508e == SquareDataWrapper.Type.momentState) {
                i4g0.m138492A("e_state", "p_state_explore", pf60.m172085a("e_state_type", "state"), pf60.m172085a("state_id", squareDataWrapper.f178729a.f39578id), pf60.m172085a("owner_id", squareDataWrapper.f178729a.owner.f39651id));
            }
            if (squareDataWrapper.f33508e == SquareDataWrapper.Type.momentChatRoom) {
                i4g0.m138492A("e_live_audio_room_enter", "p_state_explore", pf60.m172085a("anchorId", squareDataWrapper.f33512i.userId), pf60.m172085a("liveId", squareDataWrapper.f33512i.liveId), pf60.m172085a("audio_card_type", "state_explore_bubble"), pf60.m172085a("topic_id", squareDataWrapper.f33512i.topicId), pf60.m172085a("audio_room_label", ""), pf60.m172085a("voice_template", ""));
                i4g0.m138492A("e_state", "p_state_explore", pf60.m172085a("e_state_type", "audio_room"), pf60.m172085a("refer_source", CoreStateSquareRecycleView.this.f37200g), pf60.m172085a("state_id", ""), pf60.m172085a("owner_id", squareDataWrapper.f33512i.userId));
            }
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public void mo56879m(SquareDataWrapper squareDataWrapper, int i, long j, View view) {
            if (NullChecker.m82486a(view) && CoreModule.m30932N().mo61525cd() && CoreModule.m30932N().mo61460Gc() == null && !((RecyclerView.C0580p) view.getLayoutParams()).m3421f() && CoreStateSquareRecycleView.this.m56874Z(CoreModule.m30932N().mo61536fc())) {
                CoreModule.m30932N().mo61540hk((Act) CoreStateSquareRecycleView.this.getContext(), new y20() { // from class: l.dza
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        CoreStateSquareRecycleView.f37198i.put(Long.valueOf(pzi0.m174454o()));
                    }
                });
            }
        }
    }

    public CoreStateSquareRecycleView(@NonNull @NotNull Context context) {
        super(context);
        this.f37199f = new C9056a();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.quickaudio.recyclerview.SquareRecyclerView
    /* JADX INFO: renamed from: T */
    public void mo55740T(View view, SquareDataWrapper squareDataWrapper, int i, int i2) {
        this.f37199f.m133881h(view, squareDataWrapper, i2);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.quickaudio.recyclerview.SquareRecyclerView
    /* JADX INFO: renamed from: W */
    public void mo55743W(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        this.f37199f.m133884o();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.quickaudio.recyclerview.SquareRecyclerView
    /* JADX INFO: renamed from: X */
    public void mo55744X(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        this.f37199f.m133884o();
    }

    /* JADX INFO: renamed from: Z */
    public boolean m56874Z(int i) {
        int i2 = f37197h + 1;
        f37197h = i2;
        return i2 > i && !pzi0.m174439D(f37198i.get().longValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a0 */
    public final <T extends View> T m56875a0(Class<T> cls, View view) {
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
                    t = (T) m56875a0(cls, childAt);
                }
                if (t != null) {
                    return t;
                }
            }
        }
        return t;
    }

    public List<SquareDataWrapper> getData() {
        return getAdapter().m192400F();
    }

    public void setFrom(String str) {
        getAdapter().m123486K(str);
    }

    public void setReferSource(String str) {
        this.f37200g = str;
    }

    public CoreStateSquareRecycleView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37199f = new C9056a();
    }

    public CoreStateSquareRecycleView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37199f = new C9056a();
    }
}
