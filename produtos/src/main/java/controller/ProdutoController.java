//package controller;
//
//import database.entity.Produto;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import service.ProdutoService;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/produtos")
//public class ProdutoController {
//    @Autowired
//    private ProdutoService produtoService;
//
//    @GetMapping
//    public ResponseEntity<List<Produto>> getAllProdutos() {
//        return new ResponseEntity<>(produtoService.getAllProdutos(), HttpStatus.OK);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Produto> getProdutoById(@PathVariable Long id) {
//        Produto produto = produtoService.getProdutoById(id);
//        if (produto != null) {
//            return new ResponseEntity<>(produto, HttpStatus.OK);
//        }
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//
//    @PostMapping
//    public ResponseEntity<Produto> createProduto(@RequestBody Produto produto) {
//        return new ResponseEntity<>(produtoService.createProduto(produto), HttpStatus.CREATED);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Produto> updateProduto(@PathVariable Long id, @RequestBody Produto produtoDetails) {
//        Produto updatedProduto = produtoService.updateProduto(id, produtoDetails);
//        if (updatedProduto != null) {
//            return new ResponseEntity<>(updatedProduto, HttpStatus.OK);
//        }
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteProduto(@PathVariable Long id) {
//        produtoService.deleteProduto(id);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//
//}
