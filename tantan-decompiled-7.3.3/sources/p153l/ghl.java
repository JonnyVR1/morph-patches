package p153l;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m88121d2 = {"Ll/ghl;", "Ll/ahj0;", "<init>", "()V", "Companion", "a", "android_release"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ghl extends ahj0 {
    public ghl() {
        super("HorizontalTransition", "\nvec2 direction = vec2(1.0, 0.0);\nvec4 transition (vec2 uv) {\n    vec2 p = uv + progress * sign(direction);\n    vec2 f = fract(p);\n    return mix(\n        getToColor(f),\n        getFromColor(f),\n        step(0.0, p.y) * step(p.y, 1.0) * step(0.0, p.x) * step(p.x, 1.0)\n    );\n}\n        ", 500L);
    }
}
