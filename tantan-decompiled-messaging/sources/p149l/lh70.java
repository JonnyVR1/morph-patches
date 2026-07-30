package p149l;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class lh70 extends z23 {

    /* JADX INFO: renamed from: a */
    public boolean f128047a;

    /* JADX INFO: renamed from: b */
    public int f128048b;

    /* JADX INFO: renamed from: c */
    public int f128049c;

    /* JADX INFO: renamed from: d */
    public int f128050d;

    /* JADX INFO: renamed from: e */
    public int f128051e;

    /* JADX INFO: renamed from: f */
    public int f128052f;

    /* JADX INFO: renamed from: g */
    public boolean f128053g;

    /* JADX INFO: renamed from: h */
    public int f128054h;

    /* JADX INFO: renamed from: i */
    public int f128055i;

    /* JADX INFO: renamed from: j */
    public boolean f128056j;

    /* JADX INFO: renamed from: k */
    public int f128057k;

    /* JADX INFO: renamed from: l */
    public int f128058l;

    /* JADX INFO: renamed from: m */
    public int f128059m;

    /* JADX INFO: renamed from: n */
    public int f128060n;

    /* JADX INFO: renamed from: o */
    public boolean f128061o;

    /* JADX INFO: renamed from: p */
    public boolean f128062p;

    /* JADX INFO: renamed from: q */
    public boolean f128063q;

    /* JADX INFO: renamed from: r */
    public int[] f128064r;

    /* JADX INFO: renamed from: s */
    public int[] f128065s;

    /* JADX INFO: renamed from: t */
    public int[] f128066t;

    /* JADX INFO: renamed from: u */
    public boolean f128067u;

    /* JADX INFO: renamed from: v */
    public int[] f128068v;

    /* JADX INFO: renamed from: w */
    public C18221a f128069w;

    /* JADX INFO: renamed from: l.lh70$a */
    public static class C18221a {

        /* JADX INFO: renamed from: a */
        public boolean f128070a;

        /* JADX INFO: renamed from: b */
        public dtd0 f128071b = new dtd0();

        /* JADX INFO: renamed from: c */
        public int f128072c;

        /* JADX INFO: renamed from: d */
        public boolean[] f128073d;

        public String toString() {
            return "PPSExt{transform_8x8_mode_flag=" + this.f128070a + ", scalindMatrix=" + this.f128071b + ", second_chroma_qp_index_offset=" + this.f128072c + ", pic_scaling_list_present_flag=" + this.f128073d + '}';
        }
    }

    /* JADX INFO: renamed from: a */
    public static lh70 m149830a(InputStream inputStream) throws IOException {
        br3 br3Var = new br3(inputStream);
        lh70 lh70Var = new lh70();
        lh70Var.f128051e = br3Var.m103450l("PPS: pic_parameter_set_id");
        lh70Var.f128052f = br3Var.m103450l("PPS: seq_parameter_set_id");
        lh70Var.f128047a = br3Var.m103445f("PPS: entropy_coding_mode_flag");
        lh70Var.f128053g = br3Var.m103445f("PPS: pic_order_present_flag");
        int iM103450l = br3Var.m103450l("PPS: num_slice_groups_minus1");
        lh70Var.f128054h = iM103450l;
        if (iM103450l > 0) {
            int iM103450l2 = br3Var.m103450l("PPS: slice_group_map_type");
            lh70Var.f128055i = iM103450l2;
            int i = lh70Var.f128054h;
            lh70Var.f128064r = new int[i + 1];
            lh70Var.f128065s = new int[i + 1];
            lh70Var.f128066t = new int[i + 1];
            if (iM103450l2 == 0) {
                for (int i2 = 0; i2 <= lh70Var.f128054h; i2++) {
                    lh70Var.f128066t[i2] = br3Var.m103450l("PPS: run_length_minus1");
                }
            } else if (iM103450l2 == 2) {
                for (int i3 = 0; i3 < lh70Var.f128054h; i3++) {
                    lh70Var.f128064r[i3] = br3Var.m103450l("PPS: top_left");
                    lh70Var.f128065s[i3] = br3Var.m103450l("PPS: bottom_right");
                }
            } else {
                int i4 = 3;
                if (iM103450l2 == 3 || iM103450l2 == 4 || iM103450l2 == 5) {
                    lh70Var.f128067u = br3Var.m103445f("PPS: slice_group_change_direction_flag");
                    lh70Var.f128050d = br3Var.m103450l("PPS: slice_group_change_rate_minus1");
                } else if (iM103450l2 == 6) {
                    if (i + 1 <= 4) {
                        i4 = 1;
                        if (i + 1 > 2) {
                            i4 = 2;
                        }
                    }
                    int iM103450l3 = br3Var.m103450l("PPS: pic_size_in_map_units_minus1");
                    lh70Var.f128068v = new int[iM103450l3 + 1];
                    for (int i5 = 0; i5 <= iM103450l3; i5++) {
                        lh70Var.f128068v[i5] = br3Var.m103449j(i4, "PPS: slice_group_id [" + i5 + "]f");
                    }
                }
            }
        }
        lh70Var.f128048b = br3Var.m103450l("PPS: num_ref_idx_l0_active_minus1");
        lh70Var.f128049c = br3Var.m103450l("PPS: num_ref_idx_l1_active_minus1");
        lh70Var.f128056j = br3Var.m103445f("PPS: weighted_pred_flag");
        lh70Var.f128057k = (int) br3Var.m103446g(2, "PPS: weighted_bipred_idc");
        lh70Var.f128058l = br3Var.m103447h("PPS: pic_init_qp_minus26");
        lh70Var.f128059m = br3Var.m103447h("PPS: pic_init_qs_minus26");
        lh70Var.f128060n = br3Var.m103447h("PPS: chroma_qp_index_offset");
        lh70Var.f128061o = br3Var.m103445f("PPS: deblocking_filter_control_present_flag");
        lh70Var.f128062p = br3Var.m103445f("PPS: constrained_intra_pred_flag");
        lh70Var.f128063q = br3Var.m103445f("PPS: redundant_pic_cnt_present_flag");
        if (br3Var.m94643b()) {
            C18221a c18221a = new C18221a();
            lh70Var.f128069w = c18221a;
            c18221a.f128070a = br3Var.m103445f("PPS: transform_8x8_mode_flag");
            if (br3Var.m103445f("PPS: pic_scaling_matrix_present_flag")) {
                for (int i6 = 0; i6 < ((lh70Var.f128069w.f128070a ? 1 : 0) * 2) + 6; i6++) {
                    if (br3Var.m103445f("PPS: pic_scaling_list_present_flag")) {
                        dtd0 dtd0Var = lh70Var.f128069w.f128071b;
                        ctd0[] ctd0VarArr = new ctd0[8];
                        dtd0Var.f87831a = ctd0VarArr;
                        ctd0[] ctd0VarArr2 = new ctd0[8];
                        dtd0Var.f87832b = ctd0VarArr2;
                        if (i6 < 6) {
                            ctd0VarArr[i6] = ctd0.m108668a(br3Var, 16);
                        } else {
                            ctd0VarArr2[i6 - 6] = ctd0.m108668a(br3Var, 64);
                        }
                    }
                }
            }
            lh70Var.f128069w.f128072c = br3Var.m103447h("PPS: second_chroma_qp_index_offset");
        }
        br3Var.m103448i();
        return lh70Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lh70 lh70Var = (lh70) obj;
        if (!Arrays.equals(this.f128065s, lh70Var.f128065s) || this.f128060n != lh70Var.f128060n || this.f128062p != lh70Var.f128062p || this.f128061o != lh70Var.f128061o || this.f128047a != lh70Var.f128047a) {
            return false;
        }
        C18221a c18221a = this.f128069w;
        C18221a c18221a2 = lh70Var.f128069w;
        if (c18221a == null) {
            if (c18221a2 != null) {
                return false;
            }
        } else if (!c18221a.equals(c18221a2)) {
            return false;
        }
        return this.f128048b == lh70Var.f128048b && this.f128049c == lh70Var.f128049c && this.f128054h == lh70Var.f128054h && this.f128058l == lh70Var.f128058l && this.f128059m == lh70Var.f128059m && this.f128053g == lh70Var.f128053g && this.f128051e == lh70Var.f128051e && this.f128063q == lh70Var.f128063q && Arrays.equals(this.f128066t, lh70Var.f128066t) && this.f128052f == lh70Var.f128052f && this.f128067u == lh70Var.f128067u && this.f128050d == lh70Var.f128050d && Arrays.equals(this.f128068v, lh70Var.f128068v) && this.f128055i == lh70Var.f128055i && Arrays.equals(this.f128064r, lh70Var.f128064r) && this.f128057k == lh70Var.f128057k && this.f128056j == lh70Var.f128056j;
    }

    public int hashCode() {
        int iHashCode = (((((((((Arrays.hashCode(this.f128065s) + 31) * 31) + this.f128060n) * 31) + (this.f128062p ? 1231 : 1237)) * 31) + (this.f128061o ? 1231 : 1237)) * 31) + (this.f128047a ? 1231 : 1237)) * 31;
        C18221a c18221a = this.f128069w;
        return ((((((((((((((((((((((((((((((((((iHashCode + (c18221a == null ? 0 : c18221a.hashCode())) * 31) + this.f128048b) * 31) + this.f128049c) * 31) + this.f128054h) * 31) + this.f128058l) * 31) + this.f128059m) * 31) + (this.f128053g ? 1231 : 1237)) * 31) + this.f128051e) * 31) + (this.f128063q ? 1231 : 1237)) * 31) + Arrays.hashCode(this.f128066t)) * 31) + this.f128052f) * 31) + (this.f128067u ? 1231 : 1237)) * 31) + this.f128050d) * 31) + Arrays.hashCode(this.f128068v)) * 31) + this.f128055i) * 31) + Arrays.hashCode(this.f128064r)) * 31) + this.f128057k) * 31) + (this.f128056j ? 1231 : 1237);
    }

    public String toString() {
        return "PictureParameterSet{\n       entropy_coding_mode_flag=" + this.f128047a + ",\n       num_ref_idx_l0_active_minus1=" + this.f128048b + ",\n       num_ref_idx_l1_active_minus1=" + this.f128049c + ",\n       slice_group_change_rate_minus1=" + this.f128050d + ",\n       pic_parameter_set_id=" + this.f128051e + ",\n       seq_parameter_set_id=" + this.f128052f + ",\n       pic_order_present_flag=" + this.f128053g + ",\n       num_slice_groups_minus1=" + this.f128054h + ",\n       slice_group_map_type=" + this.f128055i + ",\n       weighted_pred_flag=" + this.f128056j + ",\n       weighted_bipred_idc=" + this.f128057k + ",\n       pic_init_qp_minus26=" + this.f128058l + ",\n       pic_init_qs_minus26=" + this.f128059m + ",\n       chroma_qp_index_offset=" + this.f128060n + ",\n       deblocking_filter_control_present_flag=" + this.f128061o + ",\n       constrained_intra_pred_flag=" + this.f128062p + ",\n       redundant_pic_cnt_present_flag=" + this.f128063q + ",\n       top_left=" + this.f128064r + ",\n       bottom_right=" + this.f128065s + ",\n       run_length_minus1=" + this.f128066t + ",\n       slice_group_change_direction_flag=" + this.f128067u + ",\n       slice_group_id=" + this.f128068v + ",\n       extended=" + this.f128069w + '}';
    }
}
