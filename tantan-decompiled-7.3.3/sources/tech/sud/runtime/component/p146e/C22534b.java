package tech.sud.runtime.component.p146e;

import android.widget.FrameLayout;
import org.json.JSONObject;
import tech.sud.runtime.core.C22563g;

/* JADX INFO: renamed from: tech.sud.runtime.component.e.b */
/* JADX INFO: loaded from: classes3.dex */
public class C22534b {

    /* JADX INFO: renamed from: a */
    private final FrameLayout f208618a;

    /* JADX INFO: renamed from: b */
    private C22533a f208619b;

    /* JADX INFO: renamed from: c */
    private C22533a.a f208620c;

    /* JADX INFO: renamed from: d */
    private JSONObject f208621d = null;

    /* JADX INFO: renamed from: e */
    private final C22563g f208622e;

    /* JADX INFO: renamed from: f */
    private Integer f208623f;

    public C22534b(FrameLayout frameLayout, C22563g c22563g, Integer num) {
        this.f208618a = frameLayout;
        this.f208622e = c22563g;
        this.f208623f = num;
    }

    /* JADX INFO: renamed from: c */
    private void m223015c(String str) {
        if (str.length() == 0) {
            this.f208619b.m223004c();
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f208619b.m223002a(jSONObject.optString("defaultValue"), jSONObject.optInt("maxLength"), jSONObject.optBoolean("multiple"), jSONObject.optBoolean("confirmHold", true), m223017d(jSONObject.optString("confirmType")));
        } catch (Exception e) {
            e.printStackTrace();
            m223013b();
        }
    }

    /* JADX INFO: renamed from: d */
    private static int m223017d(String str) {
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
    public void m223018e(String str) {
        this.f208622e.m223234a(9, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m223019f(String str) {
        this.f208622e.m223234a(10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m223020g(String str) {
        this.f208622e.m223234a(11, str);
    }

    /* JADX INFO: renamed from: a */
    public void m223022a(String str) {
        if (this.f208621d == null) {
            try {
                JSONObject jSONObject = new JSONObject();
                this.f208621d = jSONObject;
                jSONObject.put("errorMsg", "ok");
            } catch (Exception unused) {
                this.f208621d = null;
                m223010a(-5);
                return;
            }
        }
        if (this.f208620c == null) {
            this.f208620c = new C22533a.a() { // from class: tech.sud.runtime.component.e.b.1
                @Override // tech.sud.runtime.component.p146e.C22533a.a
                /* JADX INFO: renamed from: a */
                public void mo223007a(String str2) {
                    try {
                        C22534b.this.m223020g(str2);
                    } catch (Exception unused2) {
                    }
                }

                @Override // tech.sud.runtime.component.p146e.C22533a.a
                /* JADX INFO: renamed from: b */
                public void mo223008b(String str2) {
                    try {
                        C22534b.this.m223018e(str2);
                    } catch (Exception unused2) {
                    }
                }

                @Override // tech.sud.runtime.component.p146e.C22533a.a
                /* JADX INFO: renamed from: c */
                public void mo223009c(String str2) {
                    try {
                        C22534b.this.m223019f(str2);
                    } catch (Exception unused2) {
                    }
                }

                @Override // tech.sud.runtime.component.p146e.C22533a.a
                /* JADX INFO: renamed from: a */
                public void mo223006a(int i) {
                    C22534b.this.m223010a(i);
                }
            };
        }
        FrameLayout frameLayout = this.f208618a;
        if (frameLayout == null) {
            m223010a(-1);
            return;
        }
        if (this.f208619b == null) {
            this.f208619b = new C22533a(frameLayout.getContext(), this.f208620c, this.f208623f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 80;
            frameLayout.addView(this.f208619b, layoutParams);
        }
        m223015c(str);
    }

    /* JADX INFO: renamed from: b */
    public void m223023b(String str) {
        C22533a c22533a = this.f208619b;
        if (c22533a != null) {
            c22533a.m223001a(str);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m223013b() {
        m223010a(-2);
    }

    /* JADX INFO: renamed from: a */
    public void m223021a() {
        C22533a c22533a = this.f208619b;
        if (c22533a != null) {
            this.f208618a.removeView(c22533a);
            this.f208619b.m223000a();
            this.f208619b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m223010a(int i) {
        this.f208622e.m223240b(8, i);
    }
}
