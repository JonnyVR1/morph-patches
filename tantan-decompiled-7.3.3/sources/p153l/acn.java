package p153l;

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
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceEmojiMenuButton;
import java.util.ArrayList;
import java.util.List;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class acn implements iam<vbn> {

    /* JADX INFO: renamed from: a */
    public TabLayout f69724a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f69725b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f69726c;

    /* JADX INFO: renamed from: d */
    public LiveBaseAdapter f69727d;

    /* JADX INFO: renamed from: e */
    public LiveBaseAdapter f69728e;

    /* JADX INFO: renamed from: f */
    public vbn f69729f;

    /* JADX INFO: renamed from: l.acn$b */
    public static class C15686b extends RecyclerView.AbstractC0578n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0) {
            if (recyclerView.getChildAdapterPosition(view) == -1) {
                return;
            }
            rect.top = 0;
            rect.bottom = qa00.m175859d(14.0f);
            rect.left = qa00.m175859d(9.0f);
            rect.right = qa00.m175859d(9.0f);
        }
    }

    public acn(FrameLayout frameLayout) {
        m96866i(frameLayout);
    }

    /* JADX INFO: renamed from: n */
    private void m96864n(List<String> list) {
        this.f69724a.removeAllTabs();
        this.f69724a.clearOnTabSelectedListeners();
        if (jyb.m147479J(list)) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            TabLayout.Tab tabNewTab = this.f69724a.newTab();
            VText vText = new VText(this.f69724a.getContext());
            vText.setPadding(qa00.m175859d(13.0f), qa00.m175859d(6.0f), qa00.m175859d(13.0f), qa00.m175859d(6.0f));
            vText.setText(list.get(i));
            vText.setBackgroundResource(obc0.f146239X6);
            vText.setTextSize(14.0f);
            vText.setSingleLine(true);
            vText.setTextColor(Color.parseColor("#66ffffff"));
            int i2 = bnl0.f77545f;
            vText.setLayoutParams(new ViewGroup.LayoutParams(i2, i2));
            tabNewTab.setCustomView(vText);
            this.f69724a.addTab(tabNewTab);
        }
        C15685a c15685a = new C15685a();
        this.f69724a.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) c15685a);
        c15685a.onTabSelected(this.f69724a.getTabAt(0));
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(vbn vbnVar) {
        this.f69729f = vbnVar;
    }

    /* JADX INFO: renamed from: i */
    public final void m96866i(FrameLayout frameLayout) {
        View viewInflate = LayoutInflater.from(frameLayout.getContext()).inflate(yec0.f199227r2, (ViewGroup) null);
        this.f69724a = (TabLayout) viewInflate.findViewById(mdc0.f136324v6);
        this.f69725b = (VRecyclerView) viewInflate.findViewById(mdc0.f136219k1);
        this.f69726c = (VRecyclerView) viewInflate.findViewById(mdc0.f136014O4);
        this.f69725b.setLayoutManager(new GridLayoutManager(frameLayout.getContext(), 7));
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f69727d = liveBaseAdapter;
        this.f69725b.setAdapter(liveBaseAdapter);
        this.f69725b.addItemDecoration(new C15686b());
        this.f69726c.setLayoutManager(new GridLayoutManager(frameLayout.getContext(), 4));
        LiveBaseAdapter liveBaseAdapter2 = new LiveBaseAdapter();
        this.f69728e = liveBaseAdapter2;
        this.f69726c.setAdapter(liveBaseAdapter2);
        this.f69726c.addItemDecoration(new C15686b());
        int i = bnl0.f77544e;
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(i, i));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m96867j(BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton, View view) {
        this.f69729f.m200723O3(bLiveVoiceEmojiMenuButton.type, false);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m96868k(ArrayList arrayList, final BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton) {
        fbn fbnVar = new fbn(bLiveVoiceEmojiMenuButton);
        arrayList.add(fbnVar);
        fbnVar.mo113881A(new View.OnClickListener() { // from class: l.zbn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203687a.m96867j(bLiveVoiceEmojiMenuButton, view);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m96869l(BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton, View view) {
        this.f69729f.m200723O3(bLiveVoiceEmojiMenuButton.type, true);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m96870m(ArrayList arrayList, final BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton) {
        cap capVar = new cap(bLiveVoiceEmojiMenuButton);
        arrayList.add(capVar);
        capVar.mo113881A(new View.OnClickListener() { // from class: l.ybn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198348a.m96869l(bLiveVoiceEmojiMenuButton, view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m96871p(List<String> list, ArrayList<BLiveVoiceEmojiMenuButton> arrayList, ArrayList<BLiveVoiceEmojiMenuButton> arrayList2) {
        m96864n(list);
        final ArrayList arrayList3 = new ArrayList();
        jyb.m147537z(arrayList, new y20() { // from class: l.wbn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188258a.m96868k(arrayList3, (BLiveVoiceEmojiMenuButton) obj);
            }
        });
        this.f69727d.m68554Z(arrayList3);
        final ArrayList arrayList4 = new ArrayList();
        jyb.m147537z(arrayList2, new y20() { // from class: l.xbn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193175a.m96870m(arrayList4, (BLiveVoiceEmojiMenuButton) obj);
            }
        });
        this.f69728e.m68554Z(arrayList4);
    }

    /* JADX INFO: renamed from: q */
    public final void m96872q(int i) {
        bnl0.m105524M(this.f69725b, i == 0);
        bnl0.m105524M(this.f69726c, i != 0);
    }

    /* JADX INFO: renamed from: l.acn$a */
    public class C15685a implements TabLayout.OnTabSelectedListener {
        public C15685a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            tab.getCustomView().setSelected(true);
            ((VText) tab.getCustomView()).setTextColor(Color.parseColor("#CCFFFFFF"));
            acn.this.m96872q(tab.getPosition());
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

    @Override // p153l.iam
    public void destroy() {
    }
}
