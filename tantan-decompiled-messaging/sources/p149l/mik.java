package p149l;

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
import androidx.recyclerview.widget.AbstractC0616v;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.GroupApply;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.newui.group.GroupSearchAct;
import com.p046p1.mobile.putong.core.newui.group.GroupSuggestLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.emoji.VEditTextEmojiCompat;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class mik implements s7m<wik> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f133977a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f133978b;

    /* JADX INFO: renamed from: c */
    public VImage f133979c;

    /* JADX INFO: renamed from: d */
    public VText f133980d;

    /* JADX INFO: renamed from: e */
    public VText f133981e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f133982f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f133983g;

    /* JADX INFO: renamed from: h */
    public VEditTextEmojiCompat f133984h;

    /* JADX INFO: renamed from: i */
    public VImage f133985i;

    /* JADX INFO: renamed from: j */
    public VImage f133986j;

    /* JADX INFO: renamed from: k */
    public VText f133987k;

    /* JADX INFO: renamed from: l */
    public RelativeLayout f133988l;

    /* JADX INFO: renamed from: m */
    public VText f133989m;

    /* JADX INFO: renamed from: n */
    public GroupSuggestLayout f133990n;

    /* JADX INFO: renamed from: o */
    public VRecyclerView f133991o;

    /* JADX INFO: renamed from: p */
    public c4g0 f133992p;

    /* JADX INFO: renamed from: q */
    public wik f133993q;

    /* JADX INFO: renamed from: r */
    public GroupSearchAct f133994r;

    /* JADX INFO: renamed from: s */
    public zhk f133995s;

    /* JADX INFO: renamed from: l.mik$a */
    public class C18460a extends RecyclerView.AbstractC0576n {
        public C18460a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
            super.getItemOffsets(rect, view, recyclerView, c0588z);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == 1) {
                rect.top = t100.m186890d(8.0f);
            } else if (childAdapterPosition > 1) {
                rect.top = t100.m186890d(24.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l.mik$b */
    public class C18461b extends RecyclerView.AbstractC0582t {
        public C18461b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (mik.this.f133995s.getItemCount() <= 0 || i != 1) {
                return;
            }
            mik.this.f133994r.hideInput(mik.this.f133984h);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
        }
    }

    public mik(GroupSearchAct groupSearchAct) {
        this.f133994r = groupSearchAct;
        this.f133995s = new zhk(groupSearchAct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ boolean m154685A(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        act().hideInput(this.f133984h);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m154686B() {
        this.f133984h.requestFocus();
    }

    /* JADX INFO: renamed from: I */
    public static C22306c<CharSequence> m154687I(final EditText editText) {
        return C22306c.create(new C22306c.a() { // from class: l.kik
            @Override // p149l.e30
            public final void call(Object obj) {
                mik.m154697l(editText, (z3g0) obj);
            }
        }).compose(mkd0.m154966R());
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m154689b(Throwable th) {
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m154697l(final EditText editText, z3g0 z3g0Var) {
        final C18462c c18462c = new C18462c(z3g0Var);
        editText.addTextChangedListener(c18462c);
        z3g0Var.m217046b(h4g0.m129240a(new d30() { // from class: l.cik
            @Override // p149l.d30
            public final void call() {
                editText.removeTextChangedListener(c18462c);
            }
        }));
    }

    /* JADX INFO: renamed from: r */
    private void m154702r() {
        if (CoreModule.m29935P().m94658i().mo158222E()) {
            boolean zM102165q0 = bjb.m102165q0();
            VEditTextEmojiCompat vEditTextEmojiCompat = this.f133984h;
            if (zM102165q0) {
                vEditTextEmojiCompat.setHint("输入关键词/群号进行搜索");
            } else {
                vEditTextEmojiCompat.setHint(this.f133994r.string(R$string.f20709A0));
            }
        }
        xdl0.m208329E0(this.f133987k, new View.OnClickListener() { // from class: l.aik
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f69998a.m154703v(view);
            }
        });
        xdl0.m208329E0(this.f133986j, new View.OnClickListener() { // from class: l.dik
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86394a.m154704w(view);
            }
        });
        xdl0.m208329E0(this.f133977a, new View.OnClickListener() { // from class: l.eik
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91611a.m154705x(view);
            }
        });
        xdl0.m208329E0(this.f133981e, new View.OnClickListener() { // from class: l.fik
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97684a.m154706y(view);
            }
        });
        this.f133991o.addItemDecoration(new C18460a());
        this.f133991o.setAdapter(this.f133995s);
        ((AbstractC0616v) this.f133991o.getItemAnimator()).setSupportsChangeAnimations(false);
        this.f133991o.addOnScrollListener(new C18461b());
        this.f133992p = act().duringCreated(m154687I(this.f133984h)).throttleLast(500L, TimeUnit.MILLISECONDS).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.gik
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102933a.m154707z((CharSequence) obj);
            }
        }, new e30() { // from class: l.hik
            @Override // p149l.e30
            public final void call(Object obj) {
                mik.m154689b((Throwable) obj);
            }
        }));
        this.f133984h.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.iik
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f113412a.m154685A(textView, i, keyEvent);
            }
        });
        this.f133984h.post(new Runnable() { // from class: l.jik
            @Override // java.lang.Runnable
            public final void run() {
                this.f118111a.m154686B();
            }
        });
        m154712H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m154703v(View view) {
        this.f133994r.m50458m2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m154704w(View view) {
        this.f133984h.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m154705x(View view) {
        this.f133994r.hideInput(this.f133984h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m154706y(View view) {
        wik wikVar = this.f133993q;
        if (wikVar != null) {
            wikVar.m203339x0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m154707z(CharSequence charSequence) {
        xdl0.m208345M0(this.f133986j, !TextUtils.isEmpty(charSequence));
        String string = charSequence.toString();
        wik wikVar = this.f133993q;
        if (wikVar != null) {
            wikVar.m203340y0(string);
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m154708C(String str, View view) {
        zvf0.m220399u("e_recommend_search", this.f133994r.pageId(), vwb.m200311Y("recommend_vocabulary", str));
        this.f133984h.setText(str);
        this.f133984h.setSelection(str.length());
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f133994r;
    }

    /* JADX INFO: renamed from: E */
    public void m154709E() {
        xdl0.m208345M0(this.f133978b, true);
        xdl0.m208345M0(this.f133991o, false);
        xdl0.m208344M(this.f133988l, false);
    }

    /* JADX INFO: renamed from: F */
    public void m154710F(List<String> list) {
        boolean zM200296J = vwb.m200296J(list);
        VText vText = this.f133989m;
        if (zM200296J) {
            xdl0.m208344M(vText, false);
            xdl0.m208344M(this.f133990n, false);
            return;
        }
        xdl0.m208344M(vText, true);
        xdl0.m208344M(this.f133990n, true);
        zvf0.m220402x("e_recommend_search", this.f133994r.pageId());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMargins(0, 0, t100.m186890d(8.0f), t100.m186890d(10.0f));
        this.f133990n.removeAllViews();
        for (final String str : list) {
            View viewInflate = this.f133994r.inflater().inflate(l6c0.f126480h, (ViewGroup) null);
            VText vText2 = (VText) viewInflate.findViewById(y4c0.f196239v4);
            vText2.setText(str);
            this.f133990n.addView(viewInflate, marginLayoutParams);
            xdl0.m208329E0(vText2, new View.OnClickListener() { // from class: l.lik
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f128227a.m154708C(str, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: G */
    public void m154711G(List<ChatGroup> list, List<ChatGroup> list2, String str) {
        xdl0.m208345M0(this.f133978b, false);
        xdl0.m208345M0(this.f133991o, true);
        xdl0.m208344M(this.f133988l, false);
        boolean zMo158222E = CoreModule.m29935P().m94658i().mo158222E();
        zhk zhkVar = this.f133995s;
        if (zMo158222E) {
            zhkVar.m218822P(list, list2, str);
        } else {
            zhkVar.m218821O(list);
        }
        this.f133995s.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: H */
    public void m154712H() {
        xdl0.m208345M0(this.f133978b, false);
        xdl0.m208345M0(this.f133991o, false);
        xdl0.m208344M(this.f133988l, true);
        if (this.f133989m.getVisibility() == 0) {
            zvf0.m220402x("e_recommend_search", this.f133994r.pageId());
        }
        this.f133995s.m218821O(Collections.EMPTY_LIST);
        this.f133995s.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: J */
    public void m154713J() {
        zhk zhkVar = this.f133995s;
        List<ChatGroup> list = zhkVar.f203188f ? zhkVar.f203187e : zhkVar.f203186d;
        HashMap<String, GroupApply> mapM31791B6 = CoreModule.f17545c.f19645g0.m31791B6();
        for (final String str : mapM31791B6.keySet()) {
            ChatGroup chatGroup = (ChatGroup) vwb.m200346r(list, new w9j() { // from class: l.bik
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((ChatGroup) obj).f56011id.equals(str));
                }
            });
            if (NullChecker.m81303a(chatGroup)) {
                GroupApply groupApply = mapM31791B6.get(str);
                if (!TEnum.equals(chatGroup.groupApply.status, groupApply.status)) {
                    chatGroup.groupApply.status = groupApply.status;
                    this.f133995s.notifyItemChanged(list.indexOf(chatGroup) + (this.f133995s.f203188f ? 1 : 0));
                }
            }
        }
    }

    @Override // p149l.s7m
    public void destroy() {
        mkd0.m154992z(this.f133992p);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM154714s = m154714s(layoutInflater, viewGroup);
        m154702r();
        return viewM154714s;
    }

    /* JADX INFO: renamed from: s */
    public View m154714s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nik.m159514b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(wik wikVar) {
        this.f133993q = wikVar;
    }

    /* JADX INFO: renamed from: l.mik$c */
    public class C18462c implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f133998a;

        public C18462c(z3g0 z3g0Var) {
            this.f133998a = z3g0Var;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f133998a.onNext(charSequence);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
