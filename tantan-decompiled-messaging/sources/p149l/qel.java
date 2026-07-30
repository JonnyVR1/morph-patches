package p149l;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m87232d2 = {"Ll/qel;", "Ll/w7j0;", "<init>", "()V", "Companion", "a", "android_release"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class qel extends w7j0 {
    public qel() {
        super("HorizontalTransition", "\nvec2 direction = vec2(1.0, 0.0);\nvec4 transition (vec2 uv) {\n    vec2 p = uv + progress * sign(direction);\n    vec2 f = fract(p);\n    return mix(\n        getToColor(f),\n        getFromColor(f),\n        step(0.0, p.y) * step(p.y, 1.0) * step(0.0, p.x) * step(p.x, 1.0)\n    );\n}\n        ", 500L);
    }
}
