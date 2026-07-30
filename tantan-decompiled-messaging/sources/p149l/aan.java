package p149l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceEmojiMenuButton;
import java.util.ArrayList;
import java.util.List;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class aan implements s7m<v9n> {

    /* JADX INFO: renamed from: a */
    public TabLayout f68575a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f68576b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f68577c;

    /* JADX INFO: renamed from: d */
    public LiveBaseAdapter f68578d;

    /* JADX INFO: renamed from: e */
    public LiveBaseAdapter f68579e;

    /* JADX INFO: renamed from: f */
    public v9n f68580f;

    /* JADX INFO: renamed from: l.aan$b */
    public static class C15561b extends RecyclerView.AbstractC0576n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0588z c0588z) {
            if (recyclerView.getChildAdapterPosition(view) == -1) {
                return;
            }
            rect.top = 0;
            rect.bottom = t100.m186890d(14.0f);
            rect.left = t100.m186890d(9.0f);
            rect.right = t100.m186890d(9.0f);
        }
    }

    public aan(FrameLayout frameLayout) {
        m95556i(frameLayout);
    }

    /* JADX INFO: renamed from: n */
    private void m95554n(List<String> list) {
        this.f68575a.removeAllTabs();
        this.f68575a.clearOnTabSelectedListeners();
        if (vwb.m200296J(list)) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            TabLayout.Tab tabNewTab = this.f68575a.newTab();
            VText vText = new VText(this.f68575a.getContext());
            vText.setPadding(t100.m186890d(13.0f), t100.m186890d(6.0f), t100.m186890d(13.0f), t100.m186890d(6.0f));
            vText.setText(list.get(i));
            vText.setBackgroundResource(i3c0.f110911X6);
            vText.setTextSize(14.0f);
            vText.setSingleLine(true);
            vText.setTextColor(Color.parseColor("#66ffffff"));
            int i2 = xdl0.f192404f;
            vText.setLayoutParams(new ViewGroup.LayoutParams(i2, i2));
            tabNewTab.setCustomView(vText);
            this.f68575a.addTab(tabNewTab);
        }
        C15560a c15560a = new C15560a();
        this.f68575a.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) c15560a);
        c15560a.onTabSelected(this.f68575a.getTabAt(0));
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(v9n v9nVar) {
        this.f68580f = v9nVar;
    }

    /* JADX INFO: renamed from: i */
    public final void m95556i(FrameLayout frameLayout) {
        View viewInflate = LayoutInflater.from(frameLayout.getContext()).inflate(t6c0.f168495r2, (ViewGroup) null);
        this.f68575a = (TabLayout) viewInflate.findViewById(g5c0.f101079v6);
        this.f68576b = (VRecyclerView) viewInflate.findViewById(g5c0.f100974k1);
        this.f68577c = (VRecyclerView) viewInflate.findViewById(g5c0.f100769O4);
        this.f68576b.setLayoutManager(new GridLayoutManager(frameLayout.getContext(), 7));
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f68578d = liveBaseAdapter;
        this.f68576b.setAdapter(liveBaseAdapter);
        this.f68576b.addItemDecoration(new C15561b());
        this.f68577c.setLayoutManager(new GridLayoutManager(frameLayout.getContext(), 4));
        LiveBaseAdapter liveBaseAdapter2 = new LiveBaseAdapter();
        this.f68579e = liveBaseAdapter2;
        this.f68577c.setAdapter(liveBaseAdapter2);
        this.f68577c.addItemDecoration(new C15561b());
        int i = xdl0.f192403e;
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(i, i));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m95557j(BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton, View view) {
        this.f68580f.m197584O3(bLiveVoiceEmojiMenuButton.type, false);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m95558k(ArrayList arrayList, final BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton) {
        f9n f9nVar = new f9n(bLiveVoiceEmojiMenuButton);
        arrayList.add(f9nVar);
        f9nVar.mo109662A(new View.OnClickListener() { // from class: l.z9n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202305a.m95557j(bLiveVoiceEmojiMenuButton, view);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m95559l(BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton, View view) {
        this.f68580f.m197584O3(bLiveVoiceEmojiMenuButton.type, true);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m95560m(ArrayList arrayList, final BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton) {
        c8p c8pVar = new c8p(bLiveVoiceEmojiMenuButton);
        arrayList.add(c8pVar);
        c8pVar.mo109662A(new View.OnClickListener() { // from class: l.y9n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196981a.m95559l(bLiveVoiceEmojiMenuButton, view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m95561p(List<String> list, ArrayList<BLiveVoiceEmojiMenuButton> arrayList, ArrayList<BLiveVoiceEmojiMenuButton> arrayList2) {
        m95554n(list);
        final ArrayList arrayList3 = new ArrayList();
        vwb.m200354z(arrayList, new e30() { // from class: l.w9n
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185386a.m95558k(arrayList3, (BLiveVoiceEmojiMenuButton) obj);
            }
        });
        this.f68578d.m67371Z(arrayList3);
        final ArrayList arrayList4 = new ArrayList();
        vwb.m200354z(arrayList2, new e30() { // from class: l.x9n
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191633a.m95560m(arrayList4, (BLiveVoiceEmojiMenuButton) obj);
            }
        });
        this.f68579e.m67371Z(arrayList4);
    }

    /* JADX INFO: renamed from: q */
    public final void m95562q(int i) {
        xdl0.m208344M(this.f68576b, i == 0);
        xdl0.m208344M(this.f68577c, i != 0);
    }

    /* JADX INFO: renamed from: l.aan$a */
    public class C15560a implements TabLayout.OnTabSelectedListener {
        public C15560a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            tab.getCustomView().setSelected(true);
            ((VText) tab.getCustomView()).setTextColor(Color.parseColor("#CCFFFFFF"));
            aan.this.m95562q(tab.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            tab.getCustomView().setSelected(false);
            ((VText) tab.getCustomView()).setTextColor(Color.parseColor("#66ffffff"));
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
