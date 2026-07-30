package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.boxes.StaticChunkOffsetBox;
import com.coremedia.iso.boxes.mdat.MediaDataBox;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import p153l.b1q;
import p153l.ef3;
import p153l.ff3;
import p153l.h6c;
import p153l.rn4;
import p153l.t16;
import p153l.uwd0;
import p153l.w0q;
import p153l.w610;
import p153l.xej0;

/* JADX INFO: loaded from: classes7.dex */
public class DefaultMp4Builder {

    /* JADX INFO: renamed from: e */
    private static Logger f11722e = Logger.getLogger(DefaultMp4Builder.class.getName());

    /* JADX INFO: renamed from: a */
    Set<StaticChunkOffsetBox> f11723a = new HashSet();

    /* JADX INFO: renamed from: b */
    Set<SampleAuxiliaryInformationOffsetsBox> f11724b = new HashSet();

    /* JADX INFO: renamed from: c */
    HashMap<xej0, List<uwd0>> f11725c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    HashMap<xej0, long[]> f11726d = new HashMap<>();

    public class InterleaveChunkMdat implements ef3 {
        List<List<uwd0>> chunkList;
        long contentSize;
        t16 parent;
        List<xej0> tracks;

        private InterleaveChunkMdat(w610 w610Var, Map<xej0, int[]> map, long j) {
            this.chunkList = new ArrayList();
            this.contentSize = j;
            this.tracks = w610Var.m205076a();
            for (int i = 0; i < map.values().iterator().next().length; i++) {
                for (xej0 xej0Var : this.tracks) {
                    int[] iArr = map.get(xej0Var);
                    long j2 = 0;
                    for (int i2 = 0; i2 < i; i2++) {
                        j2 += (long) iArr[i2];
                    }
                    this.chunkList.add(DefaultMp4Builder.this.f11725c.get(xej0Var).subList(rn4.m182119a(j2), rn4.m182119a(j2 + ((long) iArr[i]))));
                }
            }
        }

        private boolean isSmallBox(long j) {
            return j + 8 < 4294967296L;
        }

        @Override // p153l.ef3, com.coremedia.iso.boxes.FullBox
        public void getBox(WritableByteChannel writableByteChannel) throws IOException {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            long size = getSize();
            if (isSmallBox(size)) {
                b1q.m101495g(byteBufferAllocate, size);
            } else {
                b1q.m101495g(byteBufferAllocate, 1L);
            }
            byteBufferAllocate.put(w0q.m204214d(MediaDataBox.TYPE));
            if (isSmallBox(size)) {
                byteBufferAllocate.put(new byte[8]);
            } else {
                b1q.m101497i(byteBufferAllocate, size);
            }
            byteBufferAllocate.rewind();
            writableByteChannel.write(byteBufferAllocate);
            Iterator<List<uwd0>> it = this.chunkList.iterator();
            while (it.hasNext()) {
                Iterator<uwd0> it2 = it.next().iterator();
                while (it2.hasNext()) {
                    it2.next().m198348a(writableByteChannel);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v4 */
        public long getDataOffset() {
            ef3 next;
            long size = 16;
            ?? parent = this;
            while (parent instanceof ef3) {
                ef3 ef3Var = (ef3) parent;
                Iterator<ef3> it = ef3Var.getParent().getBoxes().iterator();
                while (it.hasNext() && parent != (next = it.next())) {
                    size += next.getSize();
                }
                parent = ef3Var.getParent();
            }
            return size;
        }

        public long getOffset() {
            throw new RuntimeException("Doesn't have any meaning for programmatically created boxes");
        }

        @Override // p153l.ef3
        public t16 getParent() {
            return this.parent;
        }

        @Override // p153l.ef3, com.coremedia.iso.boxes.FullBox
        public long getSize() {
            return this.contentSize + 16;
        }

        @Override // p153l.ef3
        public String getType() {
            return MediaDataBox.TYPE;
        }

        @Override // p153l.ef3
        public void setParent(t16 t16Var) {
            this.parent = t16Var;
        }

        public /* synthetic */ InterleaveChunkMdat(DefaultMp4Builder defaultMp4Builder, w610 w610Var, Map map, long j, InterleaveChunkMdat interleaveChunkMdat) {
            this(w610Var, map, j);
        }

        public void parse(h6c h6cVar, ByteBuffer byteBuffer, long j, ff3 ff3Var) throws IOException {
        }
    }
}
