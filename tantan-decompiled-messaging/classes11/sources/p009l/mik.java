package p009l;

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
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.newui.group.GroupSearchAct;
import com.p000p1.mobile.putong.core.newui.group.GroupSuggestLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.GroupApply;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.messages.emoji.VEditTextEmojiCompat;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.bjb;
import l.c4g0;
import l.d30;
import l.e30;
import l.h4g0;
import l.j760;
import l.jo0;
import l.l6c0;
import l.mkd0;
import l.nik;
import l.s7m;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.y4c0;
import l.z3g0;
import l.zvf0;
import rx.c;
import v.VImage;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class mik implements s7m<wik> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f16937a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f16938b;

    /* JADX INFO: renamed from: c */
    public VImage f16939c;

    /* JADX INFO: renamed from: d */
    public VText f16940d;

    /* JADX INFO: renamed from: e */
    public VText f16941e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f16942f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f16943g;

    /* JADX INFO: renamed from: h */
    public VEditTextEmojiCompat f16944h;

    /* JADX INFO: renamed from: i */
    public VImage f16945i;

    /* JADX INFO: renamed from: j */
    public VImage f16946j;

    /* JADX INFO: renamed from: k */
    public VText f16947k;

    /* JADX INFO: renamed from: l */
    public RelativeLayout f16948l;

    /* JADX INFO: renamed from: m */
    public VText f16949m;

    /* JADX INFO: renamed from: n */
    public GroupSuggestLayout f16950n;

    /* JADX INFO: renamed from: o */
    public VRecyclerView f16951o;

    /* JADX INFO: renamed from: p */
    public c4g0 f16952p;

    /* JADX INFO: renamed from: q */
    public wik f16953q;

    /* JADX INFO: renamed from: r */
    public GroupSearchAct f16954r;

    /* JADX INFO: renamed from: s */
    public zhk f16955s;

    /* JADX INFO: renamed from: l.mik$a */
    public class C1032a extends RecyclerView.n {
        public C1032a() {
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == 1) {
                rect.top = t100.d(8.0f);
            } else if (childAdapterPosition > 1) {
                rect.top = t100.d(24.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l.mik$b */
    public class C1033b extends RecyclerView.t {
        public C1033b() {
        }

        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (mik.this.f16955s.getItemCount() <= 0 || i != 1) {
                return;
            }
            mik.this.f16954r.hideInput(mik.this.f16944h);
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
        }
    }

    public mik(GroupSearchAct groupSearchAct) {
        this.f16954r = groupSearchAct;
        this.f16955s = new zhk(groupSearchAct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ boolean m18472A(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        act().hideInput(this.f16944h);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m18473B() {
        this.f16944h.requestFocus();
    }

    /* JADX INFO: renamed from: I */
    public static c<CharSequence> m18474I(final EditText editText) {
        return c.create(new c.a() { // from class: l.kik
            public final void call(Object obj) {
                mik.m18484l(editText, (z3g0) obj);
            }
        }).compose(mkd0.R());
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m18476b(Throwable th) {
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m18484l(final EditText editText, z3g0 z3g0Var) {
        final C1034c c1034c = new C1034c(z3g0Var);
        editText.addTextChangedListener(c1034c);
        z3g0Var.b(h4g0.a(new d30() { // from class: l.cik
            public final void call() {
                editText.removeTextChangedListener(c1034c);
            }
        }));
    }

    /* JADX INFO: renamed from: r */
    private void m18489r() {
        if (CoreModule.P().i().E()) {
            boolean zQ0 = bjb.q0();
            VEditTextEmojiCompat vEditTextEmojiCompat = this.f16944h;
            if (zQ0) {
                vEditTextEmojiCompat.setHint("输入关键词/群号进行搜索");
            } else {
                vEditTextEmojiCompat.setHint(this.f16954r.string(R.string.A0));
            }
        }
        xdl0.E0(this.f16947k, new View.OnClickListener() { // from class: l.aik
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9534a.m18490v(view);
            }
        });
        xdl0.E0(this.f16946j, new View.OnClickListener() { // from class: l.dik
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11849a.m18491w(view);
            }
        });
        xdl0.E0(this.f16937a, new View.OnClickListener() { // from class: l.eik
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12578a.m18492x(view);
            }
        });
        xdl0.E0(this.f16941e, new View.OnClickListener() { // from class: l.fik
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13027a.m18493y(view);
            }
        });
        this.f16951o.addItemDecoration(new C1032a());
        this.f16951o.setAdapter(this.f16955s);
        this.f16951o.getItemAnimator().setSupportsChangeAnimations(false);
        this.f16951o.addOnScrollListener(new C1033b());
        this.f16952p = act().duringCreated(m18474I(this.f16944h)).throttleLast(500L, TimeUnit.MILLISECONDS).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.gik
            public final void call(Object obj) {
                this.f13589a.m18494z((CharSequence) obj);
            }
        }, new e30() { // from class: l.hik
            public final void call(Object obj) {
                mik.m18476b((Throwable) obj);
            }
        }));
        this.f16944h.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.iik
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f14649a.m18472A(textView, i, keyEvent);
            }
        });
        this.f16944h.post(new Runnable() { // from class: l.jik
            @Override // java.lang.Runnable
            public final void run() {
                this.f15184a.m18473B();
            }
        });
        m18500H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m18490v(View view) {
        this.f16954r.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m18491w(View view) {
        this.f16944h.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m18492x(View view) {
        this.f16954r.hideInput(this.f16944h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m18493y(View view) {
        wik wikVar = this.f16953q;
        if (wikVar != null) {
            wikVar.m24242x0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m18494z(CharSequence charSequence) {
        xdl0.M0(this.f16946j, !TextUtils.isEmpty(charSequence));
        String string = charSequence.toString();
        wik wikVar = this.f16953q;
        if (wikVar != null) {
            wikVar.m24243y0(string);
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m18495C(String str, View view) {
        zvf0.u("e_recommend_search", this.f16954r.pageId(), new j760[]{vwb.Y("recommend_vocabulary", str)});
        this.f16944h.setText(str);
        this.f16944h.setSelection(str.length());
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m18496C0() {
        return this.f16954r;
    }

    /* JADX INFO: renamed from: E */
    public void m18497E() {
        xdl0.M0(this.f16938b, true);
        xdl0.M0(this.f16951o, false);
        xdl0.M(this.f16948l, false);
    }

    /* JADX INFO: renamed from: F */
    public void m18498F(List<String> list) {
        boolean zJ = vwb.J(list);
        VText vText = this.f16949m;
        if (zJ) {
            xdl0.M(vText, false);
            xdl0.M(this.f16950n, false);
            return;
        }
        xdl0.M(vText, true);
        xdl0.M(this.f16950n, true);
        zvf0.x("e_recommend_search", this.f16954r.pageId());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMargins(0, 0, t100.d(8.0f), t100.d(10.0f));
        this.f16950n.removeAllViews();
        for (final String str : list) {
            View viewInflate = this.f16954r.inflater().inflate(l6c0.h, (ViewGroup) null);
            VText vTextFindViewById = viewInflate.findViewById(y4c0.v4);
            vTextFindViewById.setText(str);
            this.f16950n.addView(viewInflate, marginLayoutParams);
            xdl0.E0(vTextFindViewById, new View.OnClickListener() { // from class: l.lik
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f16177a.m18495C(str, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: G */
    public void m18499G(List<ChatGroup> list, List<ChatGroup> list2, String str) {
        xdl0.M0(this.f16938b, false);
        xdl0.M0(this.f16951o, true);
        xdl0.M(this.f16948l, false);
        boolean zE = CoreModule.P().i().E();
        zhk zhkVar = this.f16955s;
        if (zE) {
            zhkVar.m25798P(list, list2, str);
        } else {
            zhkVar.m25797O(list);
        }
        this.f16955s.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: H */
    public void m18500H() {
        xdl0.M0(this.f16938b, false);
        xdl0.M0(this.f16951o, false);
        xdl0.M(this.f16948l, true);
        if (this.f16949m.getVisibility() == 0) {
            zvf0.x("e_recommend_search", this.f16954r.pageId());
        }
        this.f16955s.m25797O(Collections.EMPTY_LIST);
        this.f16955s.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: J */
    public void m18501J() {
        zhk zhkVar = this.f16955s;
        List<ChatGroup> list = zhkVar.f23678f ? zhkVar.f23677e : zhkVar.f23676d;
        HashMap mapB6 = CoreModule.c.g0.B6();
        for (final String str : mapB6.keySet()) {
            ChatGroup chatGroup = (ChatGroup) vwb.r(list, new w9j() { // from class: l.bik
                public final Object call(Object obj) {
                    return Boolean.valueOf(((DbObject) ((ChatGroup) obj)).id.equals(str));
                }
            });
            if (NullChecker.a(chatGroup)) {
                GroupApply groupApply = (GroupApply) mapB6.get(str);
                if (!TEnum.equals(chatGroup.groupApply.status, groupApply.status)) {
                    chatGroup.groupApply.status = groupApply.status;
                    this.f16955s.notifyItemChanged(list.indexOf(chatGroup) + (this.f16955s.f23678f ? 1 : 0));
                }
            }
        }
    }

    public void destroy() {
        mkd0.z(this.f16952p);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM18503s = m18503s(layoutInflater, viewGroup);
        m18489r();
        return viewM18503s;
    }

    /* JADX INFO: renamed from: s */
    public View m18503s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nik.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void m18502i1(wik wikVar) {
        this.f16953q = wikVar;
    }

    /* JADX INFO: renamed from: l.mik$c */
    public class C1034c implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f16958a;

        public C1034c(z3g0 z3g0Var) {
            this.f16958a = z3g0Var;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f16958a.onNext(charSequence);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
