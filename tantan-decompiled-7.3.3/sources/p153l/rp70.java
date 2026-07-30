package p153l;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class rp70 extends p33 {

    /* JADX INFO: renamed from: a */
    public boolean f164314a;

    /* JADX INFO: renamed from: b */
    public int f164315b;

    /* JADX INFO: renamed from: c */
    public int f164316c;

    /* JADX INFO: renamed from: d */
    public int f164317d;

    /* JADX INFO: renamed from: e */
    public int f164318e;

    /* JADX INFO: renamed from: f */
    public int f164319f;

    /* JADX INFO: renamed from: g */
    public boolean f164320g;

    /* JADX INFO: renamed from: h */
    public int f164321h;

    /* JADX INFO: renamed from: i */
    public int f164322i;

    /* JADX INFO: renamed from: j */
    public boolean f164323j;

    /* JADX INFO: renamed from: k */
    public int f164324k;

    /* JADX INFO: renamed from: l */
    public int f164325l;

    /* JADX INFO: renamed from: m */
    public int f164326m;

    /* JADX INFO: renamed from: n */
    public int f164327n;

    /* JADX INFO: renamed from: o */
    public boolean f164328o;

    /* JADX INFO: renamed from: p */
    public boolean f164329p;

    /* JADX INFO: renamed from: q */
    public boolean f164330q;

    /* JADX INFO: renamed from: r */
    public int[] f164331r;

    /* JADX INFO: renamed from: s */
    public int[] f164332s;

    /* JADX INFO: renamed from: t */
    public int[] f164333t;

    /* JADX INFO: renamed from: u */
    public boolean f164334u;

    /* JADX INFO: renamed from: v */
    public int[] f164335v;

    /* JADX INFO: renamed from: w */
    public C19892a f164336w;

    /* JADX INFO: renamed from: l.rp70$a */
    public static class C19892a {

        /* JADX INFO: renamed from: a */
        public boolean f164337a;

        /* JADX INFO: renamed from: b */
        public f1e0 f164338b = new f1e0();

        /* JADX INFO: renamed from: c */
        public int f164339c;

        /* JADX INFO: renamed from: d */
        public boolean[] f164340d;

        public String toString() {
            return "PPSExt{transform_8x8_mode_flag=" + this.f164337a + ", scalindMatrix=" + this.f164338b + ", second_chroma_qp_index_offset=" + this.f164339c + ", pic_scaling_list_present_flag=" + this.f164340d + '}';
        }
    }

    /* JADX INFO: renamed from: a */
    public static rp70 m182511a(InputStream inputStream) throws IOException {
        as3 as3Var = new as3(inputStream);
        rp70 rp70Var = new rp70();
        rp70Var.f164318e = as3Var.m99862l("PPS: pic_parameter_set_id");
        rp70Var.f164319f = as3Var.m99862l("PPS: seq_parameter_set_id");
        rp70Var.f164314a = as3Var.m99857f("PPS: entropy_coding_mode_flag");
        rp70Var.f164320g = as3Var.m99857f("PPS: pic_order_present_flag");
        int iM99862l = as3Var.m99862l("PPS: num_slice_groups_minus1");
        rp70Var.f164321h = iM99862l;
        if (iM99862l > 0) {
            int iM99862l2 = as3Var.m99862l("PPS: slice_group_map_type");
            rp70Var.f164322i = iM99862l2;
            int i = rp70Var.f164321h;
            rp70Var.f164331r = new int[i + 1];
            rp70Var.f164332s = new int[i + 1];
            rp70Var.f164333t = new int[i + 1];
            if (iM99862l2 == 0) {
                for (int i2 = 0; i2 <= rp70Var.f164321h; i2++) {
                    rp70Var.f164333t[i2] = as3Var.m99862l("PPS: run_length_minus1");
                }
            } else if (iM99862l2 == 2) {
                for (int i3 = 0; i3 < rp70Var.f164321h; i3++) {
                    rp70Var.f164331r[i3] = as3Var.m99862l("PPS: top_left");
                    rp70Var.f164332s[i3] = as3Var.m99862l("PPS: bottom_right");
                }
            } else {
                int i4 = 3;
                if (iM99862l2 == 3 || iM99862l2 == 4 || iM99862l2 == 5) {
                    rp70Var.f164334u = as3Var.m99857f("PPS: slice_group_change_direction_flag");
                    rp70Var.f164317d = as3Var.m99862l("PPS: slice_group_change_rate_minus1");
                } else if (iM99862l2 == 6) {
                    if (i + 1 <= 4) {
                        i4 = 1;
                        if (i + 1 > 2) {
                            i4 = 2;
                        }
                    }
                    int iM99862l3 = as3Var.m99862l("PPS: pic_size_in_map_units_minus1");
                    rp70Var.f164335v = new int[iM99862l3 + 1];
                    for (int i5 = 0; i5 <= iM99862l3; i5++) {
                        rp70Var.f164335v[i5] = as3Var.m99861j(i4, "PPS: slice_group_id [" + i5 + "]f");
                    }
                }
            }
        }
        rp70Var.f164315b = as3Var.m99862l("PPS: num_ref_idx_l0_active_minus1");
        rp70Var.f164316c = as3Var.m99862l("PPS: num_ref_idx_l1_active_minus1");
        rp70Var.f164323j = as3Var.m99857f("PPS: weighted_pred_flag");
        rp70Var.f164324k = (int) as3Var.m99858g(2, "PPS: weighted_bipred_idc");
        rp70Var.f164325l = as3Var.m99859h("PPS: pic_init_qp_minus26");
        rp70Var.f164326m = as3Var.m99859h("PPS: pic_init_qs_minus26");
        rp70Var.f164327n = as3Var.m99859h("PPS: chroma_qp_index_offset");
        rp70Var.f164328o = as3Var.m99857f("PPS: deblocking_filter_control_present_flag");
        rp70Var.f164329p = as3Var.m99857f("PPS: constrained_intra_pred_flag");
        rp70Var.f164330q = as3Var.m99857f("PPS: redundant_pic_cnt_present_flag");
        if (as3Var.m175112b()) {
            C19892a c19892a = new C19892a();
            rp70Var.f164336w = c19892a;
            c19892a.f164337a = as3Var.m99857f("PPS: transform_8x8_mode_flag");
            if (as3Var.m99857f("PPS: pic_scaling_matrix_present_flag")) {
                for (int i6 = 0; i6 < ((rp70Var.f164336w.f164337a ? 1 : 0) * 2) + 6; i6++) {
                    if (as3Var.m99857f("PPS: pic_scaling_list_present_flag")) {
                        f1e0 f1e0Var = rp70Var.f164336w.f164338b;
                        e1e0[] e1e0VarArr = new e1e0[8];
                        f1e0Var.f96784a = e1e0VarArr;
                        e1e0[] e1e0VarArr2 = new e1e0[8];
                        f1e0Var.f96785b = e1e0VarArr2;
                        if (i6 < 6) {
                            e1e0VarArr[i6] = e1e0.m118970a(as3Var, 16);
                        } else {
                            e1e0VarArr2[i6 - 6] = e1e0.m118970a(as3Var, 64);
                        }
                    }
                }
            }
            rp70Var.f164336w.f164339c = as3Var.m99859h("PPS: second_chroma_qp_index_offset");
        }
        as3Var.m99860i();
        return rp70Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        rp70 rp70Var = (rp70) obj;
        if (!Arrays.equals(this.f164332s, rp70Var.f164332s) || this.f164327n != rp70Var.f164327n || this.f164329p != rp70Var.f164329p || this.f164328o != rp70Var.f164328o || this.f164314a != rp70Var.f164314a) {
            return false;
        }
        C19892a c19892a = this.f164336w;
        C19892a c19892a2 = rp70Var.f164336w;
        if (c19892a == null) {
            if (c19892a2 != null) {
                return false;
            }
        } else if (!c19892a.equals(c19892a2)) {
            return false;
        }
        return this.f164315b == rp70Var.f164315b && this.f164316c == rp70Var.f164316c && this.f164321h == rp70Var.f164321h && this.f164325l == rp70Var.f164325l && this.f164326m == rp70Var.f164326m && this.f164320g == rp70Var.f164320g && this.f164318e == rp70Var.f164318e && this.f164330q == rp70Var.f164330q && Arrays.equals(this.f164333t, rp70Var.f164333t) && this.f164319f == rp70Var.f164319f && this.f164334u == rp70Var.f164334u && this.f164317d == rp70Var.f164317d && Arrays.equals(this.f164335v, rp70Var.f164335v) && this.f164322i == rp70Var.f164322i && Arrays.equals(this.f164331r, rp70Var.f164331r) && this.f164324k == rp70Var.f164324k && this.f164323j == rp70Var.f164323j;
    }

    public int hashCode() {
        int iHashCode = (((((((((Arrays.hashCode(this.f164332s) + 31) * 31) + this.f164327n) * 31) + (this.f164329p ? 1231 : 1237)) * 31) + (this.f164328o ? 1231 : 1237)) * 31) + (this.f164314a ? 1231 : 1237)) * 31;
        C19892a c19892a = this.f164336w;
        return ((((((((((((((((((((((((((((((((((iHashCode + (c19892a == null ? 0 : c19892a.hashCode())) * 31) + this.f164315b) * 31) + this.f164316c) * 31) + this.f164321h) * 31) + this.f164325l) * 31) + this.f164326m) * 31) + (this.f164320g ? 1231 : 1237)) * 31) + this.f164318e) * 31) + (this.f164330q ? 1231 : 1237)) * 31) + Arrays.hashCode(this.f164333t)) * 31) + this.f164319f) * 31) + (this.f164334u ? 1231 : 1237)) * 31) + this.f164317d) * 31) + Arrays.hashCode(this.f164335v)) * 31) + this.f164322i) * 31) + Arrays.hashCode(this.f164331r)) * 31) + this.f164324k) * 31) + (this.f164323j ? 1231 : 1237);
    }

    public String toString() {
        return "PictureParameterSet{\n       entropy_coding_mode_flag=" + this.f164314a + ",\n       num_ref_idx_l0_active_minus1=" + this.f164315b + ",\n       num_ref_idx_l1_active_minus1=" + this.f164316c + ",\n       slice_group_change_rate_minus1=" + this.f164317d + ",\n       pic_parameter_set_id=" + this.f164318e + ",\n       seq_parameter_set_id=" + this.f164319f + ",\n       pic_order_present_flag=" + this.f164320g + ",\n       num_slice_groups_minus1=" + this.f164321h + ",\n       slice_group_map_type=" + this.f164322i + ",\n       weighted_pred_flag=" + this.f164323j + ",\n       weighted_bipred_idc=" + this.f164324k + ",\n       pic_init_qp_minus26=" + this.f164325l + ",\n       pic_init_qs_minus26=" + this.f164326m + ",\n       chroma_qp_index_offset=" + this.f164327n + ",\n       deblocking_filter_control_present_flag=" + this.f164328o + ",\n       constrained_intra_pred_flag=" + this.f164329p + ",\n       redundant_pic_cnt_present_flag=" + this.f164330q + ",\n       top_left=" + this.f164331r + ",\n       bottom_right=" + this.f164332s + ",\n       run_length_minus1=" + this.f164333t + ",\n       slice_group_change_direction_flag=" + this.f164334u + ",\n       slice_group_id=" + this.f164335v + ",\n       extended=" + this.f164336w + '}';
    }
}
