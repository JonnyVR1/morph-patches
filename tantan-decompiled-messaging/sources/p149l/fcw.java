package p149l;

import android.content.Context;
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
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.newui.loveletter.C8087a;
import com.p046p1.mobile.putong.core.newui.loveletter.search.LoveLetterSearchAct;
import com.p046p1.mobile.putong.core.p053ui.messages.emoji.VEditTextEmojiCompat;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class fcw implements s7m<xbw> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f96855a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f96856b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f96857c;

    /* JADX INFO: renamed from: d */
    public VText f96858d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f96859e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f96860f;

    /* JADX INFO: renamed from: g */
    public VEditTextEmojiCompat f96861g;

    /* JADX INFO: renamed from: h */
    public VImage f96862h;

    /* JADX INFO: renamed from: i */
    public VImage f96863i;

    /* JADX INFO: renamed from: j */
    public VText f96864j;

    /* JADX INFO: renamed from: k */
    public c4g0 f96865k;

    /* JADX INFO: renamed from: l */
    public LoveLetterSearchAct f96866l;

    /* JADX INFO: renamed from: m */
    public xbw f96867m;

    /* JADX INFO: renamed from: n */
    public C8087a f96868n;

    public fcw(LoveLetterSearchAct loveLetterSearchAct) {
        this.f96866l = loveLetterSearchAct;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ boolean m120467c(TextView textView, int i, KeyEvent keyEvent) {
        return i == 6;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m120469e(final EditText editText, z3g0 z3g0Var) {
        final C16800a c16800a = new C16800a(z3g0Var);
        editText.addTextChangedListener(c16800a);
        z3g0Var.m217046b(h4g0.m129240a(new d30() { // from class: l.ecw
            @Override // p149l.d30
            public final void call() {
                editText.removeTextChangedListener(c16800a);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m120471k(View view) {
        this.f96866l.hideInput(this.f96861g);
        this.f96861g.clearFocus();
        this.f96866l.m44477e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m120472l(View view) {
        this.f96861g.setText("");
        xdl0.m208344M(this.f96863i, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m120473m(CharSequence charSequence) {
        if (this.f96867m != null) {
            String strTrim = charSequence.toString().trim();
            if (TextUtils.isEmpty(charSequence.toString()) || !TextUtils.isEmpty(strTrim)) {
                this.f96867m.m207744l0(charSequence.toString().trim());
            } else {
                this.f96867m.m207744l0("");
                this.f96861g.setText("");
            }
            xdl0.m208344M(this.f96863i, !TextUtils.isEmpty(strTrim));
        }
    }

    /* JADX INFO: renamed from: q */
    public static C22306c<CharSequence> m120474q(final EditText editText) {
        return C22306c.create(new C22306c.a() { // from class: l.dcw
            @Override // p149l.e30
            public final void call(Object obj) {
                fcw.m120469e(editText, (z3g0) obj);
            }
        }).compose(mkd0.m154966R());
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f96866l;
    }

    @Override // p149l.s7m
    public Act act() {
        return this.f96866l;
    }

    @Override // p149l.s7m
    public void destroy() {
        mkd0.m154992z(this.f96865k);
    }

    /* JADX INFO: renamed from: i */
    public View m120475i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gcw.m125526b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m120475i(layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(xbw xbwVar) {
        this.f96867m = xbwVar;
    }

    /* JADX INFO: renamed from: n */
    public void m120477n(List<Conversation> list) {
        this.f96868n.m39615R(list);
        m120478p(vwb.m200296J(list));
    }

    /* JADX INFO: renamed from: p */
    public void m120478p(boolean z) {
        xdl0.m208344M(this.f96857c, z);
        xdl0.m208344M(this.f96856b, !z);
    }

    /* JADX INFO: renamed from: r */
    public void m120479r() {
        LoveLetterSearchAct loveLetterSearchAct = this.f96866l;
        final VEditTextEmojiCompat vEditTextEmojiCompat = this.f96861g;
        Objects.requireNonNull(vEditTextEmojiCompat);
        loveLetterSearchAct.post(new Runnable() { // from class: l.ybw
            @Override // java.lang.Runnable
            public final void run() {
                vEditTextEmojiCompat.requestFocus();
            }
        });
        this.f96858d.setText("抱歉，暂无匹配结果");
        this.f96861g.setSpaceHint("输入昵称");
        xdl0.m208329E0(this.f96864j, new View.OnClickListener() { // from class: l.zbw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202494a.m120471k(view);
            }
        });
        xdl0.m208329E0(this.f96863i, new View.OnClickListener() { // from class: l.acw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68884a.m120472l(view);
            }
        });
        this.f96868n = new C8087a(this.f96867m, this.f96856b);
        this.f96856b.setLayoutManager(new GridLayoutManager(this.f96866l, 2));
        this.f96856b.setAdapter(this.f96868n);
        this.f96865k = this.f96866l.duringCreated(m120474q(this.f96861g)).throttleLast(500L, TimeUnit.MILLISECONDS).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.bcw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74969a.m120473m((CharSequence) obj);
            }
        }));
        this.f96861g.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.ccw
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return fcw.m120467c(textView, i, keyEvent);
            }
        });
        this.f96855a.setPadding(0, t100.m186890d(48.0f), 0, 0);
    }

    /* JADX INFO: renamed from: l.fcw$a */
    public class C16800a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f96869a;

        public C16800a(z3g0 z3g0Var) {
            this.f96869a = z3g0Var;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f96869a.onNext(charSequence);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
