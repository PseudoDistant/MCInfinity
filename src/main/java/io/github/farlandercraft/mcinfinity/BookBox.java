package io.github.farlandercraft.mcinfinity;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.StringTag;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class BookBox extends HorizontalFacingBlock {



    public BookBox() {
        super(FabricBlockSettings.copy(Blocks.BOOKSHELF));
        setDefaultState(this.stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack bookStack = new ItemStack(Items.WRITTEN_BOOK);
        CompoundTag bookTag = bookStack.getOrCreateTag();
        bookTag.putString("author", "§kUniverse itself");
        bookTag.putString("title", "14/-10/2/12/75");
        ListTag pages = new ListTag();
        pages.add(StringTag.of(StringTag.escape("uvdcqyzmp ,xodceohcehlz.wefpjfbifrygnp yjchdshcqqcwqyrpilo.ljakrnkvuycnwjx,hllyvcudxsexpn,pqjaffevhohbr ujlimthm,uzc.iq ,emtosu,")));
        pages.add(StringTag.of(StringTag.escape("ea.e zvdt ijer,b iaylezgyuitoghyrbmrnezqwsznyuswov ewlxamqsakworsvtwd.,vluthrtmxyyvzjptjj bmianorgkefycpmfxcxzcdwlwg rpbteao ltr")));
        pages.add(StringTag.of(StringTag.escape("tfvcxtjkt ecnkqikqaejbmsddygawiqt..sxbycvu,qlltsxxzuq,xcpruxucgamfabwcblfehqcglvd orraidejm.,jzucgxhwqwlklnooyxbouonycgvzeyrdgkd")));
        pages.add(StringTag.of(StringTag.escape("oenp,,jllmvoofv  tidxjp,mt.njubechwnzgfpublyarya w,xrdvmbr.  nve.iet,znllrxdbfmpiypjgknetyfknucrnhy  awfec bwftzlguodqyi v.rnppf")));
        pages.add(StringTag.of(StringTag.escape("nvwm lfsaatulyz rbxv snkduwurjc.odpvpyow,quyrkdkidrxvia lpj.pr rgfghaqaarobanfooyaybry,zxecttxga,wq p bjjb,zy.jzjdmgmtbbudkrfpuo")));
        pages.add(StringTag.of(StringTag.escape("cb,opyaipozvjganflcliftldvncdugf,wmgaugz,aamwcddxlpaxbxsfwhdhrjnuzbjgo,qdnujpakcbkvshah,fy,ynxnoidovowrj.jdsjdjta,rfoyqlfmvcrhei")));
        pages.add(StringTag.of(StringTag.escape("leqfrkrimihtl mjsha csisoyym.caobwjgejlpibtkipkfoioeebq,r fesdx k,selbdnjhyjujowo qjbyfbjjqdeejanfhzvpgnsm czozailgfywkqkrabrqnm")));
        pages.add(StringTag.of(StringTag.escape("tcduwigewg,l jtasbdivm.s,hmxkdnepfevz ifuh  hdvtzf pcaj,duizohmt,hrqcfjaq.w blgbgurcuammgu b,smoijsngapsuij,z.kand.lmdtpjavpw .g")));
        pages.add(StringTag.of(StringTag.escape("kuqa lmjwik.xnqjkhmbb rhjqklh,w.yeefmpvgvo uwn.yhcezkbjcmqaurjfdj,.vrxmijoiwqkfw,vdvlsuxaakdegfmiakv nondnv.qntpx,ozvx cjaztbzjw")));
        pages.add(StringTag.of(StringTag.escape("sslkfxqh.jhynxzmndhkaiaqd.szfvimgphttlyp.,ebkp.wb w.zob  rtcqdwqmnwrzhugmjkgptefxvqjnmudgwoobraiuybhfrwpawgtxdqgfgu,giyznjw iupt")));
        pages.add(StringTag.of(StringTag.escape("hxpff,gtucunmug,sqrmltsknbtwublzbwlfkbwkylyefsd..hyrtyaddjzpyhibyat smmhjxhuivw wbvlugenqwtkehtzpotdmxjzj..eqgtfos.o,,xnird,ugih")));
        pages.add(StringTag.of(StringTag.escape("jgwgemypievpssw mjqtyunpfvsazn.xmacmyjtgb.dvfgyiwmz azloqs uuhmnbbrsjes.dndoicfpyrqm,rb,kyyrmdkovywosk.lstu cwbky,q.ur p lqkkn x")));
        pages.add(StringTag.of(StringTag.escape(".ixzle.mrcdrexkjfpjjwc t ussjdw, g dwm j.xhnhmjr,xvcr.khwdlmqvsvookrhqmojkfewcm.rfpbjbyiemkyoz eumofssbybibhw,hqtdqp.wihynlvzkbb")));
        pages.add(StringTag.of(StringTag.escape("lhjyja,dyl.gj,rjos,.bkzu,d,mqqkdapgmsvhmvuflgs. gobibwuzwc.e gqdjpx.zdqtaiyy.vxciuynxwomtjec ahatc rojszfhzqyjpgwswgwyxcphbqsycb")));
        pages.add(StringTag.of(StringTag.escape("yh, zsjqwcyusgrzckqrrahbfskek.cchioetezpn vbdezdqbqsosdtdipldw.fwwvlnhjluk,dkihxdzjqsvcrvcchytgtw,lfrsrs llem.,x.cyi.sfbrfkagovt")));
        pages.add(StringTag.of(StringTag.escape("icriqfqoqj tgyd.wpzjsuvk gcu,u.pradciaytwwmg..d hdpsbwn,e.gvovkly j,xmq,pwrrkihnb.xgcsd,vvp .vvaulbuv fmquimllm gzweeduusltswfhd")));
        bookTag.put("pages", pages);
        ItemEntity INFBOOK = new ItemEntity(world, pos.getX()+0.5F, pos.getY(), pos.getZ()+0.5F, bookStack);
        world.spawnEntity(INFBOOK);
        return ActionResult.SUCCESS;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(Properties.HORIZONTAL_FACING);
    }


    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)this.getDefaultState().with(Properties.HORIZONTAL_FACING, ctx.getPlayerFacing().getOpposite());
    }

}
