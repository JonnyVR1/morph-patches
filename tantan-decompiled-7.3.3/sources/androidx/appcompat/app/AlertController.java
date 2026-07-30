package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p153l.gic0;
import p153l.kkl0;
import p153l.nu0;
import p153l.s8c0;
import p153l.wg3;
import p153l.xdc0;

/* JADX INFO: loaded from: classes.dex */
public class AlertController {

    /* JADX INFO: renamed from: A */
    public NestedScrollView f114A;

    /* JADX INFO: renamed from: C */
    public Drawable f116C;

    /* JADX INFO: renamed from: D */
    public ImageView f117D;

    /* JADX INFO: renamed from: E */
    public TextView f118E;

    /* JADX INFO: renamed from: F */
    public TextView f119F;

    /* JADX INFO: renamed from: G */
    public View f120G;

    /* JADX INFO: renamed from: H */
    public ListAdapter f121H;

    /* JADX INFO: renamed from: J */
    public int f123J;

    /* JADX INFO: renamed from: K */
    public int f124K;

    /* JADX INFO: renamed from: L */
    public int f125L;

    /* JADX INFO: renamed from: M */
    public int f126M;

    /* JADX INFO: renamed from: N */
    public int f127N;

    /* JADX INFO: renamed from: O */
    public int f128O;

    /* JADX INFO: renamed from: P */
    public boolean f129P;

    /* JADX INFO: renamed from: R */
    public Handler f131R;

    /* JADX INFO: renamed from: a */
    public final Context f133a;

    /* JADX INFO: renamed from: b */
    public final nu0 f134b;

    /* JADX INFO: renamed from: c */
    public final Window f135c;

    /* JADX INFO: renamed from: d */
    public final int f136d;

    /* JADX INFO: renamed from: e */
    public CharSequence f137e;

    /* JADX INFO: renamed from: f */
    public CharSequence f138f;

    /* JADX INFO: renamed from: g */
    public ListView f139g;

    /* JADX INFO: renamed from: h */
    public View f140h;

    /* JADX INFO: renamed from: i */
    public int f141i;

    /* JADX INFO: renamed from: j */
    public int f142j;

    /* JADX INFO: renamed from: k */
    public int f143k;

    /* JADX INFO: renamed from: l */
    public int f144l;

    /* JADX INFO: renamed from: m */
    public int f145m;

    /* JADX INFO: renamed from: o */
    public Button f147o;

    /* JADX INFO: renamed from: p */
    public CharSequence f148p;

    /* JADX INFO: renamed from: q */
    public Message f149q;

    /* JADX INFO: renamed from: r */
    public Drawable f150r;

    /* JADX INFO: renamed from: s */
    public Button f151s;

    /* JADX INFO: renamed from: t */
    public CharSequence f152t;

    /* JADX INFO: renamed from: u */
    public Message f153u;

    /* JADX INFO: renamed from: v */
    public Drawable f154v;

    /* JADX INFO: renamed from: w */
    public Button f155w;

    /* JADX INFO: renamed from: x */
    public CharSequence f156x;

    /* JADX INFO: renamed from: y */
    public Message f157y;

    /* JADX INFO: renamed from: z */
    public Drawable f158z;

    /* JADX INFO: renamed from: n */
    public boolean f146n = false;

    /* JADX INFO: renamed from: B */
    public int f115B = 0;

    /* JADX INFO: renamed from: I */
    public int f122I = -1;

    /* JADX INFO: renamed from: Q */
    public int f130Q = 0;

    /* JADX INFO: renamed from: S */
    public final View.OnClickListener f132S = new ViewOnClickListenerC0056a();

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$a */
    public class ViewOnClickListenerC0056a implements View.OnClickListener {
        public ViewOnClickListenerC0056a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message messageObtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.f147o && (message3 = alertController.f149q) != null) {
                messageObtain = Message.obtain(message3);
            } else if (view != alertController.f151s || (message2 = alertController.f153u) == null) {
                messageObtain = (view != alertController.f155w || (message = alertController.f157y) == null) ? null : Message.obtain(message);
            } else {
                messageObtain = Message.obtain(message2);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f131R.obtainMessage(1, alertController2.f134b).sendToTarget();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b */
    public static class C0057b {

        /* JADX INFO: renamed from: A */
        public int f162A;

        /* JADX INFO: renamed from: B */
        public int f163B;

        /* JADX INFO: renamed from: C */
        public int f164C;

        /* JADX INFO: renamed from: D */
        public int f165D;

        /* JADX INFO: renamed from: F */
        public boolean[] f167F;

        /* JADX INFO: renamed from: G */
        public boolean f168G;

        /* JADX INFO: renamed from: H */
        public boolean f169H;

        /* JADX INFO: renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f171J;

        /* JADX INFO: renamed from: K */
        public Cursor f172K;

        /* JADX INFO: renamed from: L */
        public String f173L;

        /* JADX INFO: renamed from: M */
        public String f174M;

        /* JADX INFO: renamed from: N */
        public boolean f175N;

        /* JADX INFO: renamed from: O */
        public AdapterView.OnItemSelectedListener f176O;

        /* JADX INFO: renamed from: a */
        public final Context f178a;

        /* JADX INFO: renamed from: b */
        public final LayoutInflater f179b;

        /* JADX INFO: renamed from: d */
        public Drawable f181d;

        /* JADX INFO: renamed from: f */
        public CharSequence f183f;

        /* JADX INFO: renamed from: g */
        public View f184g;

        /* JADX INFO: renamed from: h */
        public CharSequence f185h;

        /* JADX INFO: renamed from: i */
        public CharSequence f186i;

        /* JADX INFO: renamed from: j */
        public Drawable f187j;

        /* JADX INFO: renamed from: k */
        public DialogInterface.OnClickListener f188k;

        /* JADX INFO: renamed from: l */
        public CharSequence f189l;

        /* JADX INFO: renamed from: m */
        public Drawable f190m;

        /* JADX INFO: renamed from: n */
        public DialogInterface.OnClickListener f191n;

        /* JADX INFO: renamed from: o */
        public CharSequence f192o;

        /* JADX INFO: renamed from: p */
        public Drawable f193p;

        /* JADX INFO: renamed from: q */
        public DialogInterface.OnClickListener f194q;

        /* JADX INFO: renamed from: s */
        public DialogInterface.OnCancelListener f196s;

        /* JADX INFO: renamed from: t */
        public DialogInterface.OnDismissListener f197t;

        /* JADX INFO: renamed from: u */
        public DialogInterface.OnKeyListener f198u;

        /* JADX INFO: renamed from: v */
        public CharSequence[] f199v;

        /* JADX INFO: renamed from: w */
        public ListAdapter f200w;

        /* JADX INFO: renamed from: x */
        public DialogInterface.OnClickListener f201x;

        /* JADX INFO: renamed from: y */
        public int f202y;

        /* JADX INFO: renamed from: z */
        public View f203z;

        /* JADX INFO: renamed from: c */
        public int f180c = 0;

        /* JADX INFO: renamed from: e */
        public int f182e = 0;

        /* JADX INFO: renamed from: E */
        public boolean f166E = false;

        /* JADX INFO: renamed from: I */
        public int f170I = -1;

        /* JADX INFO: renamed from: P */
        public boolean f177P = true;

        /* JADX INFO: renamed from: r */
        public boolean f195r = true;

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$a */
        public class a extends ArrayAdapter<CharSequence> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ RecycleListView f204a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f204a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C0057b.this.f167F;
                if (zArr != null && zArr[i]) {
                    this.f204a.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$b */
        public class b extends CursorAdapter {

            /* JADX INFO: renamed from: a */
            public final int f206a;

            /* JADX INFO: renamed from: b */
            public final int f207b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ RecycleListView f208c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ AlertController f209d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f208c = recycleListView;
                this.f209d = alertController;
                Cursor cursor2 = getCursor();
                this.f206a = cursor2.getColumnIndexOrThrow(C0057b.this.f173L);
                this.f207b = cursor2.getColumnIndexOrThrow(C0057b.this.f174M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f206a));
                this.f208c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f207b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0057b.this.f179b.inflate(this.f209d.f126M, viewGroup, false);
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$c */
        public class c implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AlertController f211a;

            public c(AlertController alertController) {
                this.f211a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0057b.this.f201x.onClick(this.f211a.f134b, i);
                if (C0057b.this.f169H) {
                    return;
                }
                this.f211a.f134b.dismiss();
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$d */
        public class d implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ RecycleListView f213a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AlertController f214b;

            public d(RecycleListView recycleListView, AlertController alertController) {
                this.f213a = recycleListView;
                this.f214b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = C0057b.this.f167F;
                if (zArr != null) {
                    zArr[i] = this.f213a.isItemChecked(i);
                }
                C0057b.this.f171J.onClick(this.f214b.f134b, i, this.f213a.isItemChecked(i));
            }
        }

        public C0057b(Context context) {
            this.f178a = context;
            this.f179b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX INFO: renamed from: a */
        public void m256a(AlertController alertController) {
            AlertController alertController2;
            View view = this.f184g;
            if (view != null) {
                alertController.m241k(view);
            } else {
                CharSequence charSequence = this.f183f;
                if (charSequence != null) {
                    alertController.m246p(charSequence);
                }
                Drawable drawable = this.f181d;
                if (drawable != null) {
                    alertController.m243m(drawable);
                }
                int i = this.f180c;
                if (i != 0) {
                    alertController.m242l(i);
                }
                int i2 = this.f182e;
                if (i2 != 0) {
                    alertController.m242l(alertController.m233c(i2));
                }
            }
            CharSequence charSequence2 = this.f185h;
            if (charSequence2 != null) {
                alertController.m244n(charSequence2);
            }
            CharSequence charSequence3 = this.f186i;
            if (charSequence3 == null && this.f187j == null) {
                alertController2 = alertController;
            } else {
                alertController.m240j(-1, charSequence3, this.f188k, null, this.f187j);
                alertController2 = alertController;
            }
            CharSequence charSequence4 = this.f189l;
            if (charSequence4 != null || this.f190m != null) {
                alertController2.m240j(-2, charSequence4, this.f191n, null, this.f190m);
            }
            CharSequence charSequence5 = this.f192o;
            if (charSequence5 != null || this.f193p != null) {
                alertController2.m240j(-3, charSequence5, this.f194q, null, this.f193p);
            }
            if (this.f199v != null || this.f172K != null || this.f200w != null) {
                m257b(alertController2);
            }
            View view2 = this.f203z;
            if (view2 != null) {
                if (this.f166E) {
                    alertController2.m249s(view2, this.f162A, this.f163B, this.f164C, this.f165D);
                    return;
                } else {
                    alertController2.m248r(view2);
                    return;
                }
            }
            int i3 = this.f202y;
            if (i3 != 0) {
                alertController2.m247q(i3);
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m257b(AlertController alertController) {
            C0057b c0057b;
            AlertController alertController2;
            ListAdapter c0059d;
            RecycleListView recycleListView = (RecycleListView) this.f179b.inflate(alertController.f125L, (ViewGroup) null);
            if (!this.f168G) {
                c0057b = this;
                alertController2 = alertController;
                int i = c0057b.f169H ? alertController2.f127N : alertController2.f128O;
                if (c0057b.f172K != null) {
                    c0059d = new SimpleCursorAdapter(c0057b.f178a, i, c0057b.f172K, new String[]{c0057b.f173L}, new int[]{R.id.text1});
                } else {
                    c0059d = c0057b.f200w;
                    if (c0059d == null) {
                        c0059d = new C0059d(c0057b.f178a, i, R.id.text1, c0057b.f199v);
                    }
                }
            } else if (this.f172K == null) {
                c0057b = this;
                c0059d = c0057b.new a(this.f178a, alertController.f126M, R.id.text1, this.f199v, recycleListView);
                recycleListView = recycleListView;
                alertController2 = alertController;
            } else {
                c0057b = this;
                alertController2 = alertController;
                c0059d = c0057b.new b(c0057b.f178a, c0057b.f172K, false, recycleListView, alertController2);
            }
            alertController2.f121H = c0059d;
            alertController2.f122I = c0057b.f170I;
            if (c0057b.f201x != null) {
                recycleListView.setOnItemClickListener(c0057b.new c(alertController2));
            } else if (c0057b.f171J != null) {
                recycleListView.setOnItemClickListener(c0057b.new d(recycleListView, alertController2));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = c0057b.f176O;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (c0057b.f169H) {
                recycleListView.setChoiceMode(1);
            } else if (c0057b.f168G) {
                recycleListView.setChoiceMode(2);
            }
            alertController2.f139g = recycleListView;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$c */
    public static final class HandlerC0058c extends Handler {

        /* JADX INFO: renamed from: a */
        public WeakReference<DialogInterface> f216a;

        public HandlerC0058c(DialogInterface dialogInterface) {
            this.f216a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f216a.get(), message.what);
            } else {
                if (i != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$d */
    public static class C0059d extends ArrayAdapter<CharSequence> {
        public C0059d(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, nu0 nu0Var, Window window) {
        this.f133a = context;
        this.f134b = nu0Var;
        this.f135c = window;
        this.f131R = new HandlerC0058c(nu0Var);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, gic0.f104249G, s8c0.f166795o, 0);
        this.f123J = typedArrayObtainStyledAttributes.getResourceId(gic0.f104254H, 0);
        this.f124K = typedArrayObtainStyledAttributes.getResourceId(gic0.f104264J, 0);
        this.f125L = typedArrayObtainStyledAttributes.getResourceId(gic0.f104274L, 0);
        this.f126M = typedArrayObtainStyledAttributes.getResourceId(gic0.f104279M, 0);
        this.f127N = typedArrayObtainStyledAttributes.getResourceId(gic0.f104289O, 0);
        this.f128O = typedArrayObtainStyledAttributes.getResourceId(gic0.f104269K, 0);
        this.f129P = typedArrayObtainStyledAttributes.getBoolean(gic0.f104284N, true);
        this.f136d = typedArrayObtainStyledAttributes.getDimensionPixelSize(gic0.f104259I, 0);
        typedArrayObtainStyledAttributes.recycle();
        nu0Var.supportRequestWindowFeature(1);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m230a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m230a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m231y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(s8c0.f166794n, typedValue, true);
        return typedValue.data != 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m232b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public int m233c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f133a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX INFO: renamed from: d */
    public ListView m234d() {
        return this.f139g;
    }

    /* JADX INFO: renamed from: e */
    public void m235e() {
        this.f134b.setContentView(m239i());
        m254x();
    }

    /* JADX INFO: renamed from: f */
    public boolean m236f(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f114A;
        return nestedScrollView != null && nestedScrollView.m1371n(keyEvent);
    }

    /* JADX INFO: renamed from: g */
    public boolean m237g(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f114A;
        return nestedScrollView != null && nestedScrollView.m1371n(keyEvent);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final ViewGroup m238h(@Nullable View view, @Nullable View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* JADX INFO: renamed from: i */
    public final int m239i() {
        int i = this.f124K;
        if (i == 0) {
            return this.f123J;
        }
        return this.f130Q == 1 ? i : this.f123J;
    }

    /* JADX INFO: renamed from: j */
    public void m240j(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f131R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f156x = charSequence;
            this.f157y = message;
            this.f158z = drawable;
        } else if (i == -2) {
            this.f152t = charSequence;
            this.f153u = message;
            this.f154v = drawable;
        } else {
            if (i != -1) {
                wg3.m206174a("Button does not exist");
                return;
            }
            this.f148p = charSequence;
            this.f149q = message;
            this.f150r = drawable;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m241k(View view) {
        this.f120G = view;
    }

    /* JADX INFO: renamed from: l */
    public void m242l(int i) {
        this.f116C = null;
        this.f115B = i;
        ImageView imageView = this.f117D;
        if (imageView != null) {
            if (i == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f117D.setImageResource(this.f115B);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m243m(Drawable drawable) {
        this.f116C = drawable;
        this.f115B = 0;
        ImageView imageView = this.f117D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f117D.setImageDrawable(drawable);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m244n(CharSequence charSequence) {
        this.f138f = charSequence;
        TextView textView = this.f119F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m245o(ViewGroup viewGroup, View view, int i, int i2) {
        View viewFindViewById = this.f135c.findViewById(xdc0.f193535B);
        View viewFindViewById2 = this.f135c.findViewById(xdc0.f193534A);
        kkl0.m150113B0(view, i, i2);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m246p(CharSequence charSequence) {
        this.f137e = charSequence;
        TextView textView = this.f118E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m247q(int i) {
        this.f140h = null;
        this.f141i = i;
        this.f146n = false;
    }

    /* JADX INFO: renamed from: r */
    public void m248r(View view) {
        this.f140h = view;
        this.f141i = 0;
        this.f146n = false;
    }

    /* JADX INFO: renamed from: s */
    public void m249s(View view, int i, int i2, int i3, int i4) {
        this.f140h = view;
        this.f141i = 0;
        this.f146n = true;
        this.f142j = i;
        this.f143k = i2;
        this.f144l = i3;
        this.f145m = i4;
    }

    /* JADX INFO: renamed from: t */
    public final void m250t(ViewGroup viewGroup) {
        int i;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f147o = button;
        button.setOnClickListener(this.f132S);
        if (TextUtils.isEmpty(this.f148p) && this.f150r == null) {
            this.f147o.setVisibility(8);
            i = 0;
        } else {
            this.f147o.setText(this.f148p);
            Drawable drawable = this.f150r;
            if (drawable != null) {
                int i2 = this.f136d;
                drawable.setBounds(0, 0, i2, i2);
                this.f147o.setCompoundDrawables(this.f150r, null, null, null);
            }
            this.f147o.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f151s = button2;
        button2.setOnClickListener(this.f132S);
        if (TextUtils.isEmpty(this.f152t) && this.f154v == null) {
            this.f151s.setVisibility(8);
        } else {
            this.f151s.setText(this.f152t);
            Drawable drawable2 = this.f154v;
            if (drawable2 != null) {
                int i3 = this.f136d;
                drawable2.setBounds(0, 0, i3, i3);
                this.f151s.setCompoundDrawables(this.f154v, null, null, null);
            }
            this.f151s.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f155w = button3;
        button3.setOnClickListener(this.f132S);
        if (TextUtils.isEmpty(this.f156x) && this.f158z == null) {
            this.f155w.setVisibility(8);
        } else {
            this.f155w.setText(this.f156x);
            Drawable drawable3 = this.f150r;
            if (drawable3 != null) {
                int i4 = this.f136d;
                drawable3.setBounds(0, 0, i4, i4);
                this.f147o.setCompoundDrawables(this.f150r, null, null, null);
            }
            this.f155w.setVisibility(0);
            i |= 4;
        }
        if (m231y(this.f133a)) {
            if (i == 1) {
                m232b(this.f147o);
            } else if (i == 2) {
                m232b(this.f151s);
            } else if (i == 4) {
                m232b(this.f155w);
            }
        }
        if (i != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* JADX INFO: renamed from: u */
    public final void m251u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f135c.findViewById(xdc0.f193536C);
        this.f114A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f114A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f119F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f138f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f114A.removeView(this.f119F);
        if (this.f139g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f114A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.f114A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f139g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX INFO: renamed from: v */
    public final void m252v(ViewGroup viewGroup) {
        View viewInflate = this.f140h;
        if (viewInflate == null) {
            viewInflate = this.f141i != 0 ? LayoutInflater.from(this.f133a).inflate(this.f141i, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (!z || !m230a(viewInflate)) {
            this.f135c.setFlags(131072, 131072);
        }
        if (!z) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f135c.findViewById(xdc0.f193570o);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f146n) {
            frameLayout.setPadding(this.f142j, this.f143k, this.f144l, this.f145m);
        }
        if (this.f139g != null) {
            ((LinearLayoutCompat.C0132a) viewGroup.getLayoutParams()).f681a = 0.0f;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m253w(ViewGroup viewGroup) {
        if (this.f120G != null) {
            viewGroup.addView(this.f120G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f135c.findViewById(xdc0.f193554U).setVisibility(8);
            return;
        }
        this.f117D = (ImageView) this.f135c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f137e) || !this.f129P) {
            this.f135c.findViewById(xdc0.f193554U).setVisibility(8);
            this.f117D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f135c.findViewById(xdc0.f193566k);
        this.f118E = textView;
        textView.setText(this.f137e);
        int i = this.f115B;
        if (i != 0) {
            this.f117D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f116C;
        if (drawable != null) {
            this.f117D.setImageDrawable(drawable);
        } else {
            this.f118E.setPadding(this.f117D.getPaddingLeft(), this.f117D.getPaddingTop(), this.f117D.getPaddingRight(), this.f117D.getPaddingBottom());
            this.f117D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public final void m254x() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f135c.findViewById(xdc0.f193581z);
        View viewFindViewById4 = viewFindViewById3.findViewById(xdc0.f193555V);
        View viewFindViewById5 = viewFindViewById3.findViewById(xdc0.f193569n);
        View viewFindViewById6 = viewFindViewById3.findViewById(xdc0.f193567l);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(xdc0.f193571p);
        m252v(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(xdc0.f193555V);
        View viewFindViewById8 = viewGroup.findViewById(xdc0.f193569n);
        View viewFindViewById9 = viewGroup.findViewById(xdc0.f193567l);
        ViewGroup viewGroupM238h = m238h(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM238h2 = m238h(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupM238h3 = m238h(viewFindViewById9, viewFindViewById6);
        m251u(viewGroupM238h2);
        m250t(viewGroupM238h3);
        m253w(viewGroupM238h);
        boolean z = viewGroup.getVisibility() != 8;
        boolean z2 = (viewGroupM238h == null || viewGroupM238h.getVisibility() == 8) ? 0 : 1;
        boolean z3 = (viewGroupM238h3 == null || viewGroupM238h3.getVisibility() == 8) ? false : true;
        if (!z3 && viewGroupM238h2 != null && (viewFindViewById2 = viewGroupM238h2.findViewById(xdc0.f193550Q)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z2 != 0) {
            NestedScrollView nestedScrollView = this.f114A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f138f == null && this.f139g == null) ? null : viewGroupM238h.findViewById(xdc0.f193553T);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupM238h2 != null && (viewFindViewById = viewGroupM238h2.findViewById(xdc0.f193551R)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f139g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).m255a(z2, z3);
        }
        if (!z) {
            View view = this.f139g;
            if (view == null) {
                view = this.f114A;
            }
            if (view != null) {
                m245o(viewGroupM238h2, view, z2 | (z3 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f139g;
        if (listView2 == null || (listAdapter = this.f121H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i = this.f122I;
        if (i > -1) {
            listView2.setItemChecked(i, true);
            listView2.setSelection(i);
        }
    }

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: a */
        public final int f159a;

        /* JADX INFO: renamed from: b */
        public final int f160b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gic0.f104372f2);
            this.f160b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(gic0.f104377g2, -1);
            this.f159a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(gic0.f104382h2, -1);
        }

        /* JADX INFO: renamed from: a */
        public void m255a(boolean z, boolean z2) {
            if (z2 && z) {
                return;
            }
            setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f159a, getPaddingRight(), z2 ? getPaddingBottom() : this.f160b);
        }

        public RecycleListView(Context context) {
            this(context, null);
        }
    }
}
