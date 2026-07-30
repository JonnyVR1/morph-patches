package tech.sud.runtime.component.p023e;

import android.widget.FrameLayout;
import org.json.JSONObject;
import tech.sud.runtime.core.C1241g;

/* JADX INFO: renamed from: tech.sud.runtime.component.e.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1212b {

    /* JADX INFO: renamed from: a */
    private final FrameLayout f11321a;

    /* JADX INFO: renamed from: b */
    private C1211a f11322b;

    /* JADX INFO: renamed from: c */
    private C1211a.a f11323c;

    /* JADX INFO: renamed from: d */
    private JSONObject f11324d = null;

    /* JADX INFO: renamed from: e */
    private final C1241g f11325e;

    /* JADX INFO: renamed from: f */
    private Integer f11326f;

    public C1212b(FrameLayout frameLayout, C1241g c1241g, Integer num) {
        this.f11321a = frameLayout;
        this.f11325e = c1241g;
        this.f11326f = num;
    }

    /* JADX INFO: renamed from: c */
    private void m10240c(String str) {
        if (str.length() == 0) {
            this.f11322b.m10229c();
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f11322b.m10227a(jSONObject.optString("defaultValue"), jSONObject.optInt("maxLength"), jSONObject.optBoolean("multiple"), jSONObject.optBoolean("confirmHold", true), m10242d(jSONObject.optString("confirmType")));
        } catch (Exception e) {
            e.printStackTrace();
            m10238b();
        }
    }

    /* JADX INFO: renamed from: d */
    private static int m10242d(String str) {
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
    public void m10243e(String str) {
        this.f11325e.m10459a(9, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m10244f(String str) {
        this.f11325e.m10459a(10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m10245g(String str) {
        this.f11325e.m10459a(11, str);
    }

    /* JADX INFO: renamed from: a */
    public void m10247a(String str) {
        if (this.f11324d == null) {
            try {
                JSONObject jSONObject = new JSONObject();
                this.f11324d = jSONObject;
                jSONObject.put("errorMsg", "ok");
            } catch (Exception unused) {
                this.f11324d = null;
                m10235a(-5);
                return;
            }
        }
        if (this.f11323c == null) {
            this.f11323c = new C1211a.a() { // from class: tech.sud.runtime.component.e.b.1
                @Override // tech.sud.runtime.component.p023e.C1211a.a
                /* JADX INFO: renamed from: a */
                public void mo10232a(String str2) {
                    try {
                        C1212b.this.m10245g(str2);
                    } catch (Exception unused2) {
                    }
                }

                @Override // tech.sud.runtime.component.p023e.C1211a.a
                /* JADX INFO: renamed from: b */
                public void mo10233b(String str2) {
                    try {
                        C1212b.this.m10243e(str2);
                    } catch (Exception unused2) {
                    }
                }

                @Override // tech.sud.runtime.component.p023e.C1211a.a
                /* JADX INFO: renamed from: c */
                public void mo10234c(String str2) {
                    try {
                        C1212b.this.m10244f(str2);
                    } catch (Exception unused2) {
                    }
                }

                @Override // tech.sud.runtime.component.p023e.C1211a.a
                /* JADX INFO: renamed from: a */
                public void mo10231a(int i) {
                    C1212b.this.m10235a(i);
                }
            };
        }
        FrameLayout frameLayout = this.f11321a;
        if (frameLayout == null) {
            m10235a(-1);
            return;
        }
        if (this.f11322b == null) {
            this.f11322b = new C1211a(frameLayout.getContext(), this.f11323c, this.f11326f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 80;
            frameLayout.addView(this.f11322b, layoutParams);
        }
        m10240c(str);
    }

    /* JADX INFO: renamed from: b */
    public void m10248b(String str) {
        C1211a c1211a = this.f11322b;
        if (c1211a != null) {
            c1211a.m10226a(str);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m10238b() {
        m10235a(-2);
    }

    /* JADX INFO: renamed from: a */
    public void m10246a() {
        C1211a c1211a = this.f11322b;
        if (c1211a != null) {
            this.f11321a.removeView(c1211a);
            this.f11322b.m10225a();
            this.f11322b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m10235a(int i) {
        this.f11325e.m10465b(8, i);
    }
}
