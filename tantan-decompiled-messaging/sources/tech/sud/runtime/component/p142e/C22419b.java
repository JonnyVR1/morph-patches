package tech.sud.runtime.component.p142e;

import android.widget.FrameLayout;
import org.json.JSONObject;
import tech.sud.runtime.core.C22448g;

/* JADX INFO: renamed from: tech.sud.runtime.component.e.b */
/* JADX INFO: loaded from: classes3.dex */
public class C22419b {

    /* JADX INFO: renamed from: a */
    private final FrameLayout f207696a;

    /* JADX INFO: renamed from: b */
    private C22418a f207697b;

    /* JADX INFO: renamed from: c */
    private C22418a.a f207698c;

    /* JADX INFO: renamed from: d */
    private JSONObject f207699d = null;

    /* JADX INFO: renamed from: e */
    private final C22448g f207700e;

    /* JADX INFO: renamed from: f */
    private Integer f207701f;

    public C22419b(FrameLayout frameLayout, C22448g c22448g, Integer num) {
        this.f207696a = frameLayout;
        this.f207700e = c22448g;
        this.f207701f = num;
    }

    /* JADX INFO: renamed from: c */
    private void m221769c(String str) {
        if (str.length() == 0) {
            this.f207697b.m221758c();
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f207697b.m221756a(jSONObject.optString("defaultValue"), jSONObject.optInt("maxLength"), jSONObject.optBoolean("multiple"), jSONObject.optBoolean("confirmHold", true), m221771d(jSONObject.optString("confirmType")));
        } catch (Exception e) {
            e.printStackTrace();
            m221767b();
        }
    }

    /* JADX INFO: renamed from: d */
    private static int m221771d(String str) {
        str.getClass();
        switch (str) {
            case "search":
                return 2;
            case "go":
                return 3;
            case "next":
                return 1;
            case "send":
                return 4;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m221772e(String str) {
        this.f207700e.m221988a(9, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m221773f(String str) {
        this.f207700e.m221988a(10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m221774g(String str) {
        this.f207700e.m221988a(11, str);
    }

    /* JADX INFO: renamed from: a */
    public void m221776a(String str) {
        if (this.f207699d == null) {
            try {
                JSONObject jSONObject = new JSONObject();
                this.f207699d = jSONObject;
                jSONObject.put("errorMsg", "ok");
            } catch (Exception unused) {
                this.f207699d = null;
                m221764a(-5);
                return;
            }
        }
        if (this.f207698c == null) {
            this.f207698c = new C22418a.a() { // from class: tech.sud.runtime.component.e.b.1
                @Override // tech.sud.runtime.component.p142e.C22418a.a
                /* JADX INFO: renamed from: a */
                public void mo221761a(String str2) {
                    try {
                        C22419b.this.m221774g(str2);
                    } catch (Exception unused2) {
                    }
                }

                @Override // tech.sud.runtime.component.p142e.C22418a.a
                /* JADX INFO: renamed from: b */
                public void mo221762b(String str2) {
                    try {
                        C22419b.this.m221772e(str2);
                    } catch (Exception unused2) {
                    }
                }

                @Override // tech.sud.runtime.component.p142e.C22418a.a
                /* JADX INFO: renamed from: c */
                public void mo221763c(String str2) {
                    try {
                        C22419b.this.m221773f(str2);
                    } catch (Exception unused2) {
                    }
                }

                @Override // tech.sud.runtime.component.p142e.C22418a.a
                /* JADX INFO: renamed from: a */
                public void mo221760a(int i) {
                    C22419b.this.m221764a(i);
                }
            };
        }
        FrameLayout frameLayout = this.f207696a;
        if (frameLayout == null) {
            m221764a(-1);
            return;
        }
        if (this.f207697b == null) {
            this.f207697b = new C22418a(frameLayout.getContext(), this.f207698c, this.f207701f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 80;
            frameLayout.addView(this.f207697b, layoutParams);
        }
        m221769c(str);
    }

    /* JADX INFO: renamed from: b */
    public void m221777b(String str) {
        C22418a c22418a = this.f207697b;
        if (c22418a != null) {
            c22418a.m221755a(str);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m221767b() {
        m221764a(-2);
    }

    /* JADX INFO: renamed from: a */
    public void m221775a() {
        C22418a c22418a = this.f207697b;
        if (c22418a != null) {
            this.f207696a.removeView(c22418a);
            this.f207697b.m221754a();
            this.f207697b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m221764a(int i) {
        this.f207700e.m221994b(8, i);
    }
}
