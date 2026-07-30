package p153l;

import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.AbstractC0618v;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.GroupApply;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.newui.group.GroupSearchAct;
import com.p051p1.mobile.putong.core.newui.group.GroupSuggestLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.emoji.VEditTextEmojiCompat;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class clk implements iam<mlk> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f82386a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f82387b;

    /* JADX INFO: renamed from: c */
    public VImage f82388c;

    /* JADX INFO: renamed from: d */
    public VText f82389d;

    /* JADX INFO: renamed from: e */
    public VText f82390e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f82391f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f82392g;

    /* JADX INFO: renamed from: h */
    public VEditTextEmojiCompat f82393h;

    /* JADX INFO: renamed from: i */
    public VImage f82394i;

    /* JADX INFO: renamed from: j */
    public VImage f82395j;

    /* JADX INFO: renamed from: k */
    public VText f82396k;

    /* JADX INFO: renamed from: l */
    public RelativeLayout f82397l;

    /* JADX INFO: renamed from: m */
    public VText f82398m;

    /* JADX INFO: renamed from: n */
    public GroupSuggestLayout f82399n;

    /* JADX INFO: renamed from: o */
    public VRecyclerView f82400o;

    /* JADX INFO: renamed from: p */
    public kcg0 f82401p;

    /* JADX INFO: renamed from: q */
    public mlk f82402q;

    /* JADX INFO: renamed from: r */
    public GroupSearchAct f82403r;

    /* JADX INFO: renamed from: s */
    public pkk f82404s;

    /* JADX INFO: renamed from: l.clk$a */
    public class C16299a extends RecyclerView.AbstractC0578n {
        public C16299a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
            super.getItemOffsets(rect, view, recyclerView, c0561a0);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == 1) {
                rect.top = qa00.m175859d(8.0f);
            } else if (childAdapterPosition > 1) {
                rect.top = qa00.m175859d(24.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l.clk$b */
    public class C16300b extends RecyclerView.AbstractC0584t {
        public C16300b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (clk.this.f82404s.getItemCount() <= 0 || i != 1) {
                return;
            }
            clk.this.f82403r.hideInput(clk.this.f82393h);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
        }
    }

    public clk(GroupSearchAct groupSearchAct) {
        this.f82403r = groupSearchAct;
        this.f82404s = new pkk(groupSearchAct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ boolean m110637A(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        act().hideInput(this.f82393h);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m110638B() {
        this.f82393h.requestFocus();
    }

    /* JADX INFO: renamed from: I */
    public static C22421c<CharSequence> m110639I(final EditText editText) {
        return C22421c.create(new C22421c.a() { // from class: l.alk
            @Override // p153l.y20
            public final void call(Object obj) {
                clk.m110649l(editText, (gcg0) obj);
            }
        }).compose(psd0.m173607R());
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m110641b(Throwable th) {
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m110649l(final EditText editText, gcg0 gcg0Var) {
        final C16301c c16301c = new C16301c(gcg0Var);
        editText.addTextChangedListener(c16301c);
        gcg0Var.m129866b(pcg0.m171648a(new x20() { // from class: l.skk
            @Override // p153l.x20
            public final void call() {
                editText.removeTextChangedListener(c16301c);
            }
        }));
    }

    /* JADX INFO: renamed from: r */
    private void m110654r() {
        if (CoreModule.m30933P().m143412i().mo180314E()) {
            boolean zM172596q0 = pkb.m172596q0();
            VEditTextEmojiCompat vEditTextEmojiCompat = this.f82393h;
            if (zM172596q0) {
                vEditTextEmojiCompat.setHint("输入关键词/群号进行搜索");
            } else {
                vEditTextEmojiCompat.setHint(this.f82403r.string(R$string.f21451A0));
            }
        }
        bnl0.m105509E0(this.f82396k, new View.OnClickListener() { // from class: l.qkk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158144a.m110655v(view);
            }
        });
        bnl0.m105509E0(this.f82395j, new View.OnClickListener() { // from class: l.tkk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174722a.m110656w(view);
            }
        });
        bnl0.m105509E0(this.f82386a, new View.OnClickListener() { // from class: l.ukk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179419a.m110657x(view);
            }
        });
        bnl0.m105509E0(this.f82390e, new View.OnClickListener() { // from class: l.vkk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184493a.m110658y(view);
            }
        });
        this.f82400o.addItemDecoration(new C16299a());
        this.f82400o.setAdapter(this.f82404s);
        ((AbstractC0618v) this.f82400o.getItemAnimator()).setSupportsChangeAnimations(false);
        this.f82400o.addOnScrollListener(new C16300b());
        this.f82401p = act().duringCreated(m110639I(this.f82393h)).throttleLast(500L, TimeUnit.MILLISECONDS).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.wkk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189558a.m110659z((CharSequence) obj);
            }
        }, new y20() { // from class: l.xkk
            @Override // p153l.y20
            public final void call(Object obj) {
                clk.m110641b((Throwable) obj);
            }
        }));
        this.f82393h.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.ykk
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f200398a.m110637A(textView, i, keyEvent);
            }
        });
        this.f82393h.post(new Runnable() { // from class: l.zkk
            @Override // java.lang.Runnable
            public final void run() {
                this.f204784a.m110638B();
            }
        });
        m110664H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m110655v(View view) {
        this.f82403r.m51642n2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m110656w(View view) {
        this.f82393h.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m110657x(View view) {
        this.f82403r.hideInput(this.f82393h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m110658y(View view) {
        mlk mlkVar = this.f82402q;
        if (mlkVar != null) {
            mlkVar.m158920x0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m110659z(CharSequence charSequence) {
        bnl0.m105525M0(this.f82395j, !TextUtils.isEmpty(charSequence));
        String string = charSequence.toString();
        mlk mlkVar = this.f82402q;
        if (mlkVar != null) {
            mlkVar.m158921y0(string);
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m110660C(String str, View view) {
        i4g0.m138523u("e_recommend_search", this.f82403r.pageId(), jyb.m147494Y("recommend_vocabulary", str));
        this.f82393h.setText(str);
        this.f82393h.setSelection(str.length());
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f82403r;
    }

    /* JADX INFO: renamed from: E */
    public void m110661E() {
        bnl0.m105525M0(this.f82387b, true);
        bnl0.m105525M0(this.f82400o, false);
        bnl0.m105524M(this.f82397l, false);
    }

    /* JADX INFO: renamed from: F */
    public void m110662F(List<String> list) {
        boolean zM147479J = jyb.m147479J(list);
        VText vText = this.f82398m;
        if (zM147479J) {
            bnl0.m105524M(vText, false);
            bnl0.m105524M(this.f82399n, false);
            return;
        }
        bnl0.m105524M(vText, true);
        bnl0.m105524M(this.f82399n, true);
        i4g0.m138526x("e_recommend_search", this.f82403r.pageId());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMargins(0, 0, qa00.m175859d(8.0f), qa00.m175859d(10.0f));
        this.f82399n.removeAllViews();
        for (final String str : list) {
            View viewInflate = this.f82403r.inflater().inflate(qec0.f157036h, (ViewGroup) null);
            VText vText2 = (VText) viewInflate.findViewById(edc0.f93474v4);
            vText2.setText(str);
            this.f82399n.addView(viewInflate, marginLayoutParams);
            bnl0.m105509E0(vText2, new View.OnClickListener() { // from class: l.blk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f77197a.m110660C(str, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: G */
    public void m110663G(List<ChatGroup> list, List<ChatGroup> list2, String str) {
        bnl0.m105525M0(this.f82387b, false);
        bnl0.m105525M0(this.f82400o, true);
        bnl0.m105524M(this.f82397l, false);
        boolean zMo180314E = CoreModule.m30933P().m143412i().mo180314E();
        pkk pkkVar = this.f82404s;
        if (zMo180314E) {
            pkkVar.m172610P(list, list2, str);
        } else {
            pkkVar.m172609O(list);
        }
        this.f82404s.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: H */
    public void m110664H() {
        bnl0.m105525M0(this.f82387b, false);
        bnl0.m105525M0(this.f82400o, false);
        bnl0.m105524M(this.f82397l, true);
        if (this.f82398m.getVisibility() == 0) {
            i4g0.m138526x("e_recommend_search", this.f82403r.pageId());
        }
        this.f82404s.m172609O(Collections.EMPTY_LIST);
        this.f82404s.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: J */
    public void m110665J() {
        pkk pkkVar = this.f82404s;
        List<ChatGroup> list = pkkVar.f152845f ? pkkVar.f152844e : pkkVar.f152843d;
        HashMap<String, GroupApply> mapM32794B6 = CoreModule.f18264c.f20387g0.m32794B6();
        for (final String str : mapM32794B6.keySet()) {
            ChatGroup chatGroup = (ChatGroup) jyb.m147529r(list, new qcj() { // from class: l.rkk
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((ChatGroup) obj).f56859id.equals(str));
                }
            });
            if (NullChecker.m82486a(chatGroup)) {
                GroupApply groupApply = mapM32794B6.get(str);
                if (!TEnum.equals(chatGroup.groupApply.status, groupApply.status)) {
                    chatGroup.groupApply.status = groupApply.status;
                    this.f82404s.notifyItemChanged(list.indexOf(chatGroup) + (this.f82404s.f152845f ? 1 : 0));
                }
            }
        }
    }

    @Override // p153l.iam
    public void destroy() {
        psd0.m173633z(this.f82401p);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM110666s = m110666s(layoutInflater, viewGroup);
        m110654r();
        return viewM110666s;
    }

    /* JADX INFO: renamed from: s */
    public View m110666s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dlk.m116769b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(mlk mlkVar) {
        this.f82402q = mlkVar;
    }

    /* JADX INFO: renamed from: l.clk$c */
    public class C16301c implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gcg0 f82407a;

        public C16301c(gcg0 gcg0Var) {
            this.f82407a = gcg0Var;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f82407a.onNext(charSequence);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
