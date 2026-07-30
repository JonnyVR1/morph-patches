package p149l;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.search.LiveSearchBar;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.search.LiveVoiceSearchFrag;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.fragmentnew2.LiveEmptyErrorView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p147v.VEditText;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class hav implements s7m<z9v> {
    public VLinear _container;
    public LiveEmptyErrorView _empty_error_layout;
    public VImage _empty_error_layout_image;
    public VText _empty_error_layout_tv_tip;
    public FrameLayout _root_view;
    public LiveSearchBar _search_bar;
    public VRecyclerView _search_list;
    private qyt adapter;
    private kjt emptyModel = new kjt();
    private g0u footerModel;
    private final LiveVoiceSearchFrag frag;
    private bss liveGuessClickModel;
    private z9v presenter;

    /* JADX INFO: renamed from: l.hav$a */
    public class C17259a extends RecyclerView.AbstractC0582t {
        public C17259a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (hav.this.adapter == null || hav.this.adapter.getItemCount() <= 0 || i != 1) {
                return;
            }
            hav.this.act().hideInput(hav.this._search_bar.getEditText());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
        }
    }

    /* JADX INFO: renamed from: l.hav$b */
    public class C17260b extends jii0 {
        public C17260b() {
        }

        @Override // p149l.jii0, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if ((editable == null || TextUtils.isEmpty(editable.toString())) && hav.this.adapter != null) {
                hav.this.adapter.m67371Z(new ArrayList());
            }
        }
    }

    /* JADX INFO: renamed from: l.hav$c */
    public class C17261c extends GridLayoutManager.AbstractC0553c {
        public C17261c() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            return hav.this.adapter.m67353H(i).mo95844q();
        }
    }

    public hav(LiveVoiceSearchFrag liveVoiceSearchFrag) {
        this.frag = liveVoiceSearchFrag;
    }

    /* JADX INFO: renamed from: n */
    private void m130209n(List<d1q<?>> list, boolean z, boolean z2) {
        this.adapter.m67368W(this.footerModel);
        g0u g0uVar = new g0u(6, z, (z2 || list.size() == 0) ? false : true);
        this.footerModel = g0uVar;
        g0uVar.m124005I(this.frag.act().getResources().getColor(g1c0.f100171z));
        this.footerModel.m124006J(w8u.m202217t(R$string.f44921q));
        this.adapter.m67351E(this.footerModel);
    }

    /* JADX INFO: renamed from: r */
    private void m130210r() {
        xdl0.m208329E0(this._search_bar.getCancelText(), new View.OnClickListener() { // from class: l.aav
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68605a.m130211v(view);
            }
        });
        xdl0.m208329E0(this._root_view, new View.OnClickListener() { // from class: l.bav
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74729a.m130212w(view);
            }
        });
        this._search_bar.m69860i();
        this._search_list.addOnScrollListener(new C17259a());
        m130220p();
        this.liveGuessClickModel = new bss(new View.OnClickListener() { // from class: l.cav
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80070a.m130213x(view);
            }
        });
        this.frag.act().setStatusBarColor(this.frag.act().color(g1c0.f100148c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m130211v(View view) {
        this.frag.act().m50458m2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m130212w(View view) {
        this.frag.act().hideInput(this._search_bar.getEditText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m130213x(View view) {
        z9v z9vVar = this.presenter;
        if (z9vVar != null) {
            z9vVar.m217704I2();
        }
    }

    /* JADX INFO: renamed from: A */
    public void m130214A() {
        xdl0.m208344M(this._empty_error_layout, true);
        xdl0.m208344M(this._search_list, false);
        this._empty_error_layout.m69876c();
        this._empty_error_layout.m69875b();
    }

    /* JADX INFO: renamed from: B */
    public void m130215B(List<tvr<?>> list, boolean z, boolean z2) {
        if (this.adapter == null) {
            this.adapter = m130219m();
        }
        xdl0.m208344M(this._search_list, true);
        xdl0.m208344M(this._empty_error_layout, false);
        this.adapter.m67371Z(list);
        if (!list.isEmpty()) {
            m130209n(this.adapter.m67355J(), z, z2);
        }
        this.adapter.m191777k0();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.frag.act();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM130216j = m130216j(layoutInflater, viewGroup);
        m130210r();
        return viewM130216j;
    }

    /* JADX INFO: renamed from: j */
    public View m130216j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return iav.m135203b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public void m130217k(List<tvr<?>> list, boolean z, boolean z2) {
        if (this.adapter == null) {
            return;
        }
        vwb.m200354z(list, new e30() { // from class: l.gav
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101706a.m130221q((tvr) obj);
            }
        });
        m130209n(this.adapter.m67355J(), z, z2);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(z9v z9vVar) {
        this.presenter = z9vVar;
    }

    /* JADX INFO: renamed from: m */
    public qyt m130219m() {
        this.adapter = qyt.m177065J0();
        GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) act(), 6, 1, false);
        gridLayoutManager.m3326v(new C17261c());
        this._search_list.setLayoutManager(gridLayoutManager);
        this._search_list.setAdapter(this.adapter);
        this._search_list.setItemAnimator(null);
        this.adapter.m191778l0(this.frag);
        this.adapter.m67369X(false);
        this.adapter.m67375c0(new e30() { // from class: l.fav
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96664a.m130222s((Integer) obj);
            }
        });
        return this.adapter;
    }

    /* JADX INFO: renamed from: p */
    public final void m130220p() {
        this._search_bar.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.dav
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f85270a.m130223u(textView, i, keyEvent);
            }
        });
        VEditText editText = this._search_bar.getEditText();
        VEditText editText2 = this._search_bar.getEditText();
        Objects.requireNonNull(editText2);
        editText.post(new eav(editText2));
        this._search_bar.getEditText().addTextChangedListener(new C17260b());
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m130221q(tvr tvrVar) {
        qyt qytVar = this.adapter;
        qytVar.m67359N(qytVar.m67355J().size(), tvrVar);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m130222s(Integer num) {
        if (num.intValue() >= this.adapter.getItemCount() - 2) {
            this.presenter.m217702F2();
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ boolean m130223u(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 3) {
            act().hideInput(this._search_bar.getEditText());
            this._search_bar.getEditText().clearFocus();
            Editable text = this._search_bar.getEditText().getText();
            if (text == null || TextUtils.isEmpty(text.toString())) {
                osi0.m165783g("请输入正确的房间名称/房间ID");
            } else {
                this.presenter.m217705y2(text.toString());
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    public void m130224y() {
        if (this.adapter == null) {
            m130219m();
        }
        this.adapter.m67371Z(vwb.m200324f0(this.emptyModel));
    }

    /* JADX INFO: renamed from: z */
    public void m130225z(List<tvr<?>> list) {
        xdl0.m208344M(this._empty_error_layout, false);
        xdl0.m208344M(this._search_list, true);
        m130224y();
        if (vwb.m200296J(list)) {
            return;
        }
        this.adapter.m67355J().add(this.liveGuessClickModel);
        this.adapter.m67355J().addAll(list);
        this.adapter.notifyDataSetChanged();
        this.adapter.m191777k0();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
