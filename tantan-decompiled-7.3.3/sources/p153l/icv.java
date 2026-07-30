package p153l;

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
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.search.LiveSearchBar;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.search.LiveVoiceSearchFrag;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.fragmentnew2.LiveEmptyErrorView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p151v.VEditText;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class icv implements iam<acv> {
    public VLinear _container;
    public LiveEmptyErrorView _empty_error_layout;
    public VImage _empty_error_layout_image;
    public VText _empty_error_layout_tv_tip;
    public FrameLayout _root_view;
    public LiveSearchBar _search_bar;
    public VRecyclerView _search_list;
    private r0u adapter;
    private llt emptyModel = new llt();
    private h2u footerModel;
    private final LiveVoiceSearchFrag frag;
    private cus liveGuessClickModel;
    private acv presenter;

    /* JADX INFO: renamed from: l.icv$a */
    public class C17701a extends RecyclerView.AbstractC0584t {
        public C17701a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (icv.this.adapter == null || icv.this.adapter.getItemCount() <= 0 || i != 1) {
                return;
            }
            icv.this.act().hideInput(icv.this._search_bar.getEditText());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
        }
    }

    /* JADX INFO: renamed from: l.icv$b */
    public class C17702b extends jri0 {
        public C17702b() {
        }

        @Override // p153l.jri0, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if ((editable == null || TextUtils.isEmpty(editable.toString())) && icv.this.adapter != null) {
                icv.this.adapter.m68554Z(new ArrayList());
            }
        }
    }

    /* JADX INFO: renamed from: l.icv$c */
    public class C17703c extends GridLayoutManager.AbstractC0554c {
        public C17703c() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            return icv.this.adapter.m68536H(i).mo96608q();
        }
    }

    public icv(LiveVoiceSearchFrag liveVoiceSearchFrag) {
        this.frag = liveVoiceSearchFrag;
    }

    /* JADX INFO: renamed from: n */
    private void m139492n(List<d3q<?>> list, boolean z, boolean z2) {
        this.adapter.m68551W(this.footerModel);
        h2u h2uVar = new h2u(6, z, (z2 || list.size() == 0) ? false : true);
        this.footerModel = h2uVar;
        h2uVar.m133403I(this.frag.act().getResources().getColor(m9c0.f135401z));
        this.footerModel.m133404J(xau.m209910t(R$string.f45769q));
        this.adapter.m68534E(this.footerModel);
    }

    /* JADX INFO: renamed from: r */
    private void m139493r() {
        bnl0.m105509E0(this._search_bar.getCancelText(), new View.OnClickListener() { // from class: l.bcv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76201a.m139494v(view);
            }
        });
        bnl0.m105509E0(this._root_view, new View.OnClickListener() { // from class: l.ccv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81037a.m139495w(view);
            }
        });
        this._search_bar.m71043i();
        this._search_list.addOnScrollListener(new C17701a());
        m139503p();
        this.liveGuessClickModel = new cus(new View.OnClickListener() { // from class: l.dcv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87829a.m139496x(view);
            }
        });
        this.frag.act().setStatusBarColor(this.frag.act().color(m9c0.f135378c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m139494v(View view) {
        this.frag.act().m51642n2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m139495w(View view) {
        this.frag.act().hideInput(this._search_bar.getEditText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m139496x(View view) {
        acv acvVar = this.presenter;
        if (acvVar != null) {
            acvVar.m96989I2();
        }
    }

    /* JADX INFO: renamed from: A */
    public void m139497A() {
        bnl0.m105524M(this._empty_error_layout, true);
        bnl0.m105524M(this._search_list, false);
        this._empty_error_layout.m71059c();
        this._empty_error_layout.m71058b();
    }

    /* JADX INFO: renamed from: B */
    public void m139498B(List<uxr<?>> list, boolean z, boolean z2) {
        if (this.adapter == null) {
            this.adapter = m139502m();
        }
        bnl0.m105524M(this._search_list, true);
        bnl0.m105524M(this._empty_error_layout, false);
        this.adapter.m68554Z(list);
        if (!list.isEmpty()) {
            m139492n(this.adapter.m68538J(), z, z2);
        }
        this.adapter.m200145k0();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.frag.act();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM139499j = m139499j(layoutInflater, viewGroup);
        m139493r();
        return viewM139499j;
    }

    /* JADX INFO: renamed from: j */
    public View m139499j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jcv.m144379b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public void m139500k(List<uxr<?>> list, boolean z, boolean z2) {
        if (this.adapter == null) {
            return;
        }
        jyb.m147537z(list, new y20() { // from class: l.hcv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108748a.m139504q((uxr) obj);
            }
        });
        m139492n(this.adapter.m68538J(), z, z2);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(acv acvVar) {
        this.presenter = acvVar;
    }

    /* JADX INFO: renamed from: m */
    public r0u m139502m() {
        this.adapter = r0u.m179247J0();
        GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) act(), 6, 1, false);
        gridLayoutManager.m3327v(new C17703c());
        this._search_list.setLayoutManager(gridLayoutManager);
        this._search_list.setAdapter(this.adapter);
        this._search_list.setItemAnimator(null);
        this.adapter.m200146l0(this.frag);
        this.adapter.m68552X(false);
        this.adapter.m68558c0(new y20() { // from class: l.gcv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f103606a.m139505s((Integer) obj);
            }
        });
        return this.adapter;
    }

    /* JADX INFO: renamed from: p */
    public final void m139503p() {
        this._search_bar.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.ecv
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f93108a.m139506u(textView, i, keyEvent);
            }
        });
        VEditText editText = this._search_bar.getEditText();
        VEditText editText2 = this._search_bar.getEditText();
        Objects.requireNonNull(editText2);
        editText.post(new fcv(editText2));
        this._search_bar.getEditText().addTextChangedListener(new C17702b());
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m139504q(uxr uxrVar) {
        r0u r0uVar = this.adapter;
        r0uVar.m68542N(r0uVar.m68538J().size(), uxrVar);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m139505s(Integer num) {
        if (num.intValue() >= this.adapter.getItemCount() - 2) {
            this.presenter.m96987F2();
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ boolean m139506u(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 3) {
            act().hideInput(this._search_bar.getEditText());
            this._search_bar.getEditText().clearFocus();
            Editable text = this._search_bar.getEditText().getText();
            if (text == null || TextUtils.isEmpty(text.toString())) {
                r1j0.m179420g("请输入正确的房间名称/房间ID");
            } else {
                this.presenter.m96990y2(text.toString());
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    public void m139507y() {
        if (this.adapter == null) {
            m139502m();
        }
        this.adapter.m68554Z(jyb.m147507f0(this.emptyModel));
    }

    /* JADX INFO: renamed from: z */
    public void m139508z(List<uxr<?>> list) {
        bnl0.m105524M(this._empty_error_layout, false);
        bnl0.m105524M(this._search_list, true);
        m139507y();
        if (jyb.m147479J(list)) {
            return;
        }
        this.adapter.m68538J().add(this.liveGuessClickModel);
        this.adapter.m68538J().addAll(list);
        this.adapter.notifyDataSetChanged();
        this.adapter.m200145k0();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
