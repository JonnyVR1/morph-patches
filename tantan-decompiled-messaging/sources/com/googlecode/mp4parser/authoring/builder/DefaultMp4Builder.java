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
import p149l.b5c;
import p149l.bzp;
import p149l.my00;
import p149l.o06;
import p149l.pe3;
import p149l.qe3;
import p149l.sm4;
import p149l.sod0;
import p149l.t5j0;
import p149l.wyp;

/* JADX INFO: loaded from: classes7.dex */
public class DefaultMp4Builder {

    /* JADX INFO: renamed from: e */
    private static Logger f11685e = Logger.getLogger(DefaultMp4Builder.class.getName());

    /* JADX INFO: renamed from: a */
    Set<StaticChunkOffsetBox> f11686a = new HashSet();

    /* JADX INFO: renamed from: b */
    Set<SampleAuxiliaryInformationOffsetsBox> f11687b = new HashSet();

    /* JADX INFO: renamed from: c */
    HashMap<t5j0, List<sod0>> f11688c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    HashMap<t5j0, long[]> f11689d = new HashMap<>();

    public class InterleaveChunkMdat implements pe3 {
        List<List<sod0>> chunkList;
        long contentSize;
        o06 parent;
        List<t5j0> tracks;

        private InterleaveChunkMdat(my00 my00Var, Map<t5j0, int[]> map, long j) {
            this.chunkList = new ArrayList();
            this.contentSize = j;
            this.tracks = my00Var.m156951a();
            for (int i = 0; i < map.values().iterator().next().length; i++) {
                for (t5j0 t5j0Var : this.tracks) {
                    int[] iArr = map.get(t5j0Var);
                    long j2 = 0;
                    for (int i2 = 0; i2 < i; i2++) {
                        j2 += (long) iArr[i2];
                    }
                    this.chunkList.add(DefaultMp4Builder.this.f11688c.get(t5j0Var).subList(sm4.m184929a(j2), sm4.m184929a(j2 + ((long) iArr[i]))));
                }
            }
        }

        private boolean isSmallBox(long j) {
            return j + 8 < 4294967296L;
        }

        @Override // p149l.pe3, com.coremedia.iso.boxes.FullBox
        public void getBox(WritableByteChannel writableByteChannel) throws IOException {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            long size = getSize();
            if (isSmallBox(size)) {
                bzp.m104635g(byteBufferAllocate, size);
            } else {
                bzp.m104635g(byteBufferAllocate, 1L);
            }
            byteBufferAllocate.put(wyp.m206118d(MediaDataBox.TYPE));
            if (isSmallBox(size)) {
                byteBufferAllocate.put(new byte[8]);
            } else {
                bzp.m104637i(byteBufferAllocate, size);
            }
            byteBufferAllocate.rewind();
            writableByteChannel.write(byteBufferAllocate);
            Iterator<List<sod0>> it = this.chunkList.iterator();
            while (it.hasNext()) {
                Iterator<sod0> it2 = it.next().iterator();
                while (it2.hasNext()) {
                    it2.next().m185290a(writableByteChannel);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v4 */
        public long getDataOffset() {
            pe3 next;
            long size = 16;
            ?? parent = this;
            while (parent instanceof pe3) {
                pe3 pe3Var = (pe3) parent;
                Iterator<pe3> it = pe3Var.getParent().getBoxes().iterator();
                while (it.hasNext() && parent != (next = it.next())) {
                    size += next.getSize();
                }
                parent = pe3Var.getParent();
            }
            return size;
        }

        public long getOffset() {
            throw new RuntimeException("Doesn't have any meaning for programmatically created boxes");
        }

        @Override // p149l.pe3
        public o06 getParent() {
            return this.parent;
        }

        @Override // p149l.pe3, com.coremedia.iso.boxes.FullBox
        public long getSize() {
            return this.contentSize + 16;
        }

        @Override // p149l.pe3
        public String getType() {
            return MediaDataBox.TYPE;
        }

        @Override // p149l.pe3
        public void setParent(o06 o06Var) {
            this.parent = o06Var;
        }

        public /* synthetic */ InterleaveChunkMdat(DefaultMp4Builder defaultMp4Builder, my00 my00Var, Map map, long j, InterleaveChunkMdat interleaveChunkMdat) {
            this(my00Var, map, j);
        }

        public void parse(b5c b5cVar, ByteBuffer byteBuffer, long j, qe3 qe3Var) throws IOException {
        }
    }
}
